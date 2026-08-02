package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.Executor;
import sg.bigo.ads.an.o;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.g;
import xsna.i5s;

/* loaded from: classes9.dex */
public class AdImageView extends ImageView {
    protected final sg.bigo.ads.bj.b a;
    private boolean b;
    private boolean c;

    public AdImageView(Context context) {
        this(context, null);
    }

    public static Pair<Boolean, String> a(Context context, String str) {
        String a = sg.bigo.ads.bj.a.a(str, (String) null);
        StringBuilder sb = new StringBuilder();
        sb.append(o.e(context));
        String a2 = i5s.a(sb, File.separator, a);
        return new Pair<>(Boolean.valueOf(g.c(a2)), a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageBitmapInternal(Bitmap bitmap) {
        if (this.c) {
            e.a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    private void setImageBitmapWithGradient(Bitmap bitmap) {
        e.a(bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.common.view.AdImageView.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                final Bitmap bitmap3 = bitmap2;
                AdImageView.this.post(new Runnable() { // from class: sg.bigo.ads.common.view.AdImageView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdImageView.this.setImageBitmapInternal(bitmap3);
                    }
                });
            }
        });
    }

    public void setBlurBorder(boolean z) {
        this.b = z;
    }

    public void setFadeEnable(boolean z) {
        this.c = z;
    }

    public void setIconTag(boolean z) {
        sg.bigo.ads.bj.b bVar = this.a;
        if (bVar != null) {
            bVar.b = z;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (!this.b || bitmap == null) {
            setImageBitmapInternal(bitmap);
        } else {
            setImageBitmapWithGradient(bitmap);
        }
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = false;
        this.a = new sg.bigo.ads.bj.b(this);
    }

    public final void a() {
        this.a.c.clear();
    }

    public final void a(String str, boolean z) {
        a(null, str, z);
    }

    public final void a(@Nullable Executor executor, String str, boolean z) {
        this.a.a(executor, str, z);
    }

    public final void a(sg.bigo.ads.bj.g gVar) {
        this.a.a(gVar);
    }
}
