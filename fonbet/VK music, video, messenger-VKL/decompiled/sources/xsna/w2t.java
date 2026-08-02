package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import xsna.iwv;

/* compiled from: GalleryBackgroundPicker.kt */
/* loaded from: classes2.dex */
public final class w2t {
    public static final String e = c.h.c.a;
    public final a1w a;
    public final mxv b;
    public final io.reactivex.rxjava3.core.w c;
    public final io.reactivex.rxjava3.core.w d;

    /* compiled from: GalleryBackgroundPicker.kt */
    public static final class a extends iwv.b {
        public final FragmentActivity a;
        public final a1w b;
        public final io.reactivex.rxjava3.core.r<DialogBackground> c;
        public final io.reactivex.rxjava3.core.w d;

        public a(FragmentActivity fragmentActivity, a1w a1wVar, io.reactivex.rxjava3.core.r rVar, io.reactivex.rxjava3.core.w wVar) {
            this.a = fragmentActivity;
            this.b = a1wVar;
            this.c = rVar;
            this.d = wVar;
        }
    }

    public w2t(a1w a1wVar, mxv mxvVar, io.reactivex.rxjava3.core.w wVar, io.reactivex.rxjava3.core.w wVar2) {
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = wVar;
        this.d = wVar2;
    }
}
