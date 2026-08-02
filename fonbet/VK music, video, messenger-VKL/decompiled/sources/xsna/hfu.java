package xsna;

import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: _Sequences.kt */
/* loaded from: classes4.dex */
public final class hfu implements izs<Object, Boolean> {
    public static final hfu b = new hfu();

    @Override // xsna.izs
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof PhotoAttachment);
    }
}
