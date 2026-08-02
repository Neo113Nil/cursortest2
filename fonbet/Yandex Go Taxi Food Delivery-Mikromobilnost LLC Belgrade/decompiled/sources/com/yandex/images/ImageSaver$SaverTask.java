package com.yandex.images;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import defpackage.ny61;
import defpackage.oev;
import defpackage.pev;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
class ImageSaver$SaverTask extends AsyncTask<Void, Void, Void> {
    private final oev mCallback;
    private final Bitmap mImage;
    private final WeakReference<pev> mImageSaverWeak;

    public ImageSaver$SaverTask(pev pevVar, Bitmap bitmap, oev oevVar) {
        this.mImageSaverWeak = new WeakReference<>(pevVar);
        this.mImage = bitmap;
    }

    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) {
        if (this.mImageSaverWeak.get() == null) {
            return null;
        }
        ny61.u();
        return null;
    }
}
