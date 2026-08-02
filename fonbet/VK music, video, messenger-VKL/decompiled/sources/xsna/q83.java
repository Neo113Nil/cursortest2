package xsna;

import android.content.IntentFilter;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.search.params.api.VkFeedSearchParams;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5b0;
import xsna.r0i;

/* compiled from: AppRedirectsSettingsFragment.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class q83 extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q83(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (((java.lang.Boolean) r0.c.invoke()).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r0.c == false) goto L21;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        switch (this.b) {
            case 0:
                AppRedirectsSettingsFragment appRedirectsSettingsFragment = (AppRedirectsSettingsFragment) this.receiver;
                appRedirectsSettingsFragment.getClass();
                h3p0.b(appRedirectsSettingsFragment);
                return s3q0.a;
            case 1:
                mh8 mh8Var = (mh8) this.receiver;
                mh8Var.getClass();
                try {
                    anj.d(mh8Var.a, mh8Var.b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, 2);
                } catch (RuntimeException e) {
                    mh8Var.c.warn("An error occurred when trying register network receiver", e);
                }
                return s3q0.a;
            case 2:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.receiver;
                hVar.getClass();
                hVar.i.setContent(new jai(625736787, new qed(3, r0i.b.a, hVar), true));
                return s3q0.a;
            case 3:
                zak0 zak0Var = (zak0) ((o4r) this.receiver).j1;
                VkFeedSearchParams copy = ((VkFeedSearchParams) zak0Var.getValue()).copy();
                VkFeedSearchParams.SortType sortType = copy.b;
                VkFeedSearchParams.SortType sortType2 = VkFeedSearchParams.SortType.RELEVANT;
                if (sortType == sortType2) {
                    sortType2 = VkFeedSearchParams.SortType.DATE;
                }
                copy.b = sortType2;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 4:
                p1b0 p1b0Var = ((b5b0) this.receiver).b;
                if (p1b0Var != null) {
                    if (!(p1b0Var instanceof b5b0.b)) {
                        if (p1b0Var instanceof b5b0.a) {
                            b5b0.a aVar = (b5b0.a) p1b0Var;
                            if (aVar.a) {
                                break;
                            }
                        }
                    } else {
                        b5b0.b bVar = (b5b0.b) p1b0Var;
                        if (((Boolean) bVar.a.invoke()).booleanValue()) {
                            break;
                        }
                    }
                    return Boolean.valueOf(r0);
                }
                boolean z = false;
                return Boolean.valueOf(z);
            default:
                ProfileFabView.H((ProfileFabView) this.receiver);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q83(Object obj) {
        super(0, obj, com.vk.profile.core.scheduled_clips.h.class, "hideDatePicker", "hideDatePicker()V", 0);
        this.b = 2;
    }
}
