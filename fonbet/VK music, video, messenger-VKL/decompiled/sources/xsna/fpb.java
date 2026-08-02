package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.placeholder.OnboardingBannerVh;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.exceptions.stacktrace.StopBgSyncAnrStackTraceInfoException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.metrics.eventtracking.VkMainTracker;
import java.util.Collection;
import java.util.Iterator;
import xsna.epb;
import xsna.gob;
import xsna.jpb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class fpb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fpb(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                gpb gpbVar = (gpb) this.c;
                gob.a aVar = (gob.a) this.d;
                epb epbVar = (epb) this.e;
                DialogExt dialogExt = aVar.c;
                DialogExt dialogExt2 = gpbVar.i;
                if (dialogExt2 == null) {
                    gpbVar.i = dialogExt;
                } else {
                    ProfilesInfo profilesInfo = dialogExt2.b;
                    if (profilesInfo != null) {
                        profilesInfo.Hb(dialogExt.b);
                    }
                }
                DialogExt dialogExt3 = gpbVar.i;
                if (dialogExt3 == null) {
                    dialogExt3 = aVar.c;
                }
                gpbVar.T(new jpb.a(dialogExt3, aVar.a, ((epb.a) epbVar).d));
                break;
            case 1:
                ((k5q) this.c).j((soz) this.d, (or10) this.e, "fragment_cancelled");
                break;
            case 2:
                h7v h7vVar = (h7v) this.c;
                OnboardingBannerVh onboardingBannerVh = (OnboardingBannerVh) this.d;
                UIBlock uIBlock = (UIBlock) this.e;
                h7vVar.b(onboardingBannerVh.b.getId());
                onboardingBannerVh.c.b(new xxf0(uIBlock.Fb()), false);
                break;
            case 3:
                ((j7b0) this.c).y((Context) this.d, (Playlist) this.e);
                break;
            default:
                Collection collection = (Collection) this.c;
                VkMainTracker vkMainTracker = (VkMainTracker) this.d;
                StopBgSyncAnrStackTraceInfoException stopBgSyncAnrStackTraceInfoException = (StopBgSyncAnrStackTraceInfoException) this.e;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    vkMainTracker.m(new tm1(vkMainTracker, (String) it.next(), stopBgSyncAnrStackTraceInfoException, 8));
                }
                break;
        }
        return s3q0.a;
    }
}
