package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import defpackage.ny61;
import defpackage.t2i0;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public class SVGImageView extends ImageView {
    private static Method setLayerTypeMethod;
    private g renderOptions;
    private l svg;

    public class LoadResourceTask extends AsyncTask<Integer, Integer, l> {
        private Context context;
        private int resourceId;

        public LoadResourceTask(Context context, int i) {
            this.context = context;
            this.resourceId = i;
        }

        @Override // android.os.AsyncTask
        public l doInBackground(Integer... numArr) {
            try {
                Context context = this.context;
                int i = this.resourceId;
                Resources resources = context.getResources();
                q qVar = new q();
                InputStream openRawResource = resources.openRawResource(i);
                try {
                    return qVar.f(openRawResource);
                } finally {
                    try {
                        openRawResource.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (SVGParseException e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.resourceId), e.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(l lVar) {
            SVGImageView.this.svg = lVar;
            SVGImageView.this.doRender();
        }
    }

    public class LoadURITask extends AsyncTask<InputStream, Integer, l> {
        private LoadURITask() {
        }

        @Override // android.os.AsyncTask
        public l doInBackground(InputStream... inputStreamArr) {
            try {
                try {
                    return new q().f(inputStreamArr[0]);
                } catch (SVGParseException e) {
                    Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                    try {
                        inputStreamArr[0].close();
                        return null;
                    } catch (IOException unused) {
                        return null;
                    }
                }
            } finally {
                try {
                    inputStreamArr[0].close();
                } catch (IOException unused2) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(l lVar) {
            SVGImageView.this.svg = lVar;
            SVGImageView.this.doRender();
        }
    }

    static {
        try {
            setLayerTypeMethod = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.svg = null;
        this.renderOptions = new g();
        init(attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRender() {
        l lVar = this.svg;
        if (lVar == null) {
            return;
        }
        Picture g = lVar.g(this.renderOptions);
        setSoftwareLayerType();
        setImageDrawable(new PictureDrawable(g));
    }

    private void init(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, t2i0.SVGImageView, i, 0);
        try {
            String string = obtainStyledAttributes.getString(t2i0.SVGImageView_css);
            if (string != null) {
                this.renderOptions.a(string);
            }
            int resourceId = obtainStyledAttributes.getResourceId(t2i0.SVGImageView_svg, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                obtainStyledAttributes.recycle();
                return;
            }
            String string2 = obtainStyledAttributes.getString(t2i0.SVGImageView_svg);
            if (string2 != null) {
                if (internalSetImageURI(Uri.parse(string2))) {
                    obtainStyledAttributes.recycle();
                    return;
                } else {
                    if (internalSetImageAsset(string2)) {
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    setFromString(string2);
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private boolean internalSetImageAsset(String str) {
        try {
            new LoadURITask().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private boolean internalSetImageURI(Uri uri) {
        try {
            new LoadURITask().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    private void setFromString(String str) {
        try {
            this.svg = new q().f(new ByteArrayInputStream(str.getBytes()));
            doRender();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    private void setSoftwareLayerType() {
        if (setLayerTypeMethod == null) {
            return;
        }
        try {
            setLayerTypeMethod.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception unused) {
        }
    }

    public void setCSS(String str) {
        this.renderOptions.a(str);
        doRender();
    }

    public void setImageAsset(String str) {
        if (internalSetImageAsset(str)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + str);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new LoadResourceTask(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (internalSetImageURI(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(l lVar, String str) {
        if (lVar == null) {
            ny61.g("Null value passed to setSVG()");
            return;
        }
        this.svg = lVar;
        this.renderOptions.a(str);
        doRender();
    }

    public SVGImageView(Context context) {
        super(context);
        this.svg = null;
        this.renderOptions = new g();
    }

    public void setSVG(l lVar) {
        if (lVar != null) {
            this.svg = lVar;
            doRender();
        } else {
            ny61.g("Null value passed to setSVG()");
        }
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.svg = null;
        this.renderOptions = new g();
        init(attributeSet, i);
    }
}
