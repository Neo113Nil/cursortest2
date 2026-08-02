package xsna;

import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;

/* compiled from: _Sequences.kt */
/* loaded from: classes4.dex */
public final class jbq0 implements izs {
    public static final jbq0 c = new jbq0(0);
    public static final jbq0 d = new jbq0(1);
    public final /* synthetic */ int b;

    public /* synthetic */ jbq0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof UploadDto);
            default:
                if (obj != null) {
                    return (dl1) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.vkontakte.android.upload.events.AlbumUploadEvent");
        }
    }
}
