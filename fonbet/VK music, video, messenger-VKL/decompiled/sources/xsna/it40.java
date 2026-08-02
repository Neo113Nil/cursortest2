package xsna;

import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;

/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class it40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ it40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return qjg.a((MusicPickerListItem) ((wow) this.c).b.get(((Number) obj).intValue()));
            default:
                ((SnowballsCoverHolder) this.c).d = (io.reactivex.rxjava3.disposables.c) obj;
                return s3q0.a;
        }
    }
}
