package xsna;

import com.vk.libvideo.design.compose.video.topshelf.state.TopshelfCardMetaCountState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class pvi implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ pvi(UserProfileBaseInfoState userProfileBaseInfoState, izs izsVar, int i, int i2) {
        this.b = 2;
        this.d = userProfileBaseInfoState;
        this.e = izsVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                rvi.a((c9e0) this.d, (wzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                obp0.a((TopshelfCardMetaCountState) this.d, (jap0) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                com.vk.profile.design.view.profileheader.b.o((UserProfileBaseInfoState) this.d, (izs) this.e, this.c, (androidx.compose.runtime.a) obj, I);
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.video.videocell.a.a((VideoCellViewState.c) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.g((lzj0) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ pvi(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
