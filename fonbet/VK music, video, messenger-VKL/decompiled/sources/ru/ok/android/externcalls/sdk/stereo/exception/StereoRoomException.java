package ru.ok.android.externcalls.sdk.stereo.exception;

import xsna.zcl;

/* compiled from: StereoRoomException.kt */
/* loaded from: classes9.dex */
public class StereoRoomException extends RuntimeException {
    public StereoRoomException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ StereoRoomException(String str, Throwable th, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
