package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import defpackage.cpg;

/* loaded from: classes10.dex */
public final class a implements cpg {
    public final ParcelFileDescriptorRewinder$InternalRewinder a;

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.cpg
    public final void cleanup() {
    }

    @Override // defpackage.cpg
    public final Object d() {
        return this.a.rewind();
    }
}
