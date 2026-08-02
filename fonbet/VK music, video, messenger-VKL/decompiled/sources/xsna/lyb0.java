package xsna;

import com.vk.api.generated.stickers.dto.StickersMarkPopupAnimationInterruptedResponseDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.music.MusicSignalInfo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.stickers.settings.b;
import com.vk.voip.ui.scheduled.callslist.VoipScheduledCallsFragment;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.e8v0;
import xsna.f360;
import xsna.v7h0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class lyb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lyb0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MusicTrack musicTrack;
        Object obj2;
        Object obj3;
        int i = this.b;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                StickersMarkPopupAnimationInterruptedResponseDto stickersMarkPopupAnimationInterruptedResponseDto = (StickersMarkPopupAnimationInterruptedResponseDto) obj;
                boolean d = stickersMarkPopupAnimationInterruptedResponseDto.d();
                myb0.d().a(hyb0.a((hyb0) ((Ref$ObjectRef) obj5).element, false, stickersMarkPopupAnimationInterruptedResponseDto.e() ? 0 : ref$IntRef.element, 3));
                break;
            case 1:
                r9e0 r9e0Var = (r9e0) obj5;
                f8f0 f8f0Var = (f8f0) obj4;
                f360.a aVar = (f360.a) obj;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (it.hasNext()) {
                    it.next().d(f8f0Var, aVar);
                }
                r9e0Var.c.b(f8f0Var.c);
                break;
            case 2:
                bi20 bi20Var = (bi20) obj5;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) obj4;
                MusicSignalInfo musicSignalInfo = (MusicSignalInfo) obj;
                Iterator<T> it2 = musicSignalInfo.g.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object Ab = catalogExtendedData.Ab(CatalogDataType.DATA_TYPE_MUSIC_TRACKS, (String) it2.next());
                        MusicTrack musicTrack2 = Ab instanceof MusicTrack ? (MusicTrack) Ab : null;
                        if (musicTrack2 != null) {
                            musicTrack = musicTrack2;
                        }
                    } else {
                        musicTrack = null;
                    }
                }
                Iterator<T> it3 = bi20Var.l.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj2 = it3.next();
                        if (obj2 != null ? obj2 instanceof UIBlockActionPlayAudiosFromBlock : true) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (!(obj2 instanceof UIBlockActionPlayAudiosFromBlock)) {
                    obj2 = null;
                }
                UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) obj2;
                Iterator<T> it4 = bi20Var.l.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (obj3 != null ? obj3 instanceof UIBlockActionOpenSection : true) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                break;
            case 3:
                ((k6l0) obj5).l.a.c.invoke(new b.g(((l6l0) obj4).c));
                break;
            case 4:
                jzl0 jzl0Var = (jzl0) obj5;
                StoryEntry storyEntry = (StoryEntry) obj4;
                tnm0 tnm0Var = (tnm0) obj;
                if (tnm0Var.e && tnm0Var.d == null) {
                    jzl0Var.q.add(Integer.valueOf(storyEntry.c));
                }
                break;
            case 5:
                ((q7v0) ((mxq0) obj5).u.getValue()).a((VkOnboardingCampaign) obj4, VkOnboardingType.Tooltip, e8v0.m.b);
                break;
            case 6:
                ljo0 ljo0Var = (ljo0) obj;
                ((wh50) obj5).setValue(ljo0Var);
                ((izs) obj4).invoke(ljo0Var);
                break;
            case 7:
                ((vnw0) obj5).a.a((Mask) obj4, (String) obj);
                break;
            case 8:
                nrw0 nrw0Var = (nrw0) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                int i2 = ((brj0) obj).a;
                if (i2 == 0) {
                    nrw0Var.q(new xcw0.a(true));
                } else if (i2 == 1) {
                    nrw0Var.q(new xcw0.a(false));
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 9:
                int i3 = VoipScheduledCallsFragment.c0;
                ((VoipScheduledCallsFragment) obj5).fo((v7h0.c) obj, (VoipScheduledCallsFragment.b) obj4);
                break;
            default:
                StoryBoxPrepared storyBoxPrepared = (StoryBoxPrepared) obj5;
                zhx0 zhx0Var = (zhx0) obj4;
                g2v.c().k().v(new jbs((FragmentImpl) obj), new StoryBoxPrepared(storyBoxPrepared.b, storyBoxPrepared.c, Integer.valueOf((int) zhx0Var.c.longValue()), zhx0Var.d), null);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lyb0(myb0 myb0Var, Ref$ObjectRef ref$ObjectRef, Ref$IntRef ref$IntRef) {
        this.b = 0;
        this.c = ref$ObjectRef;
        this.d = ref$IntRef;
    }

    public /* synthetic */ lyb0(nrw0 nrw0Var, Ref$ObjectRef ref$ObjectRef) {
        this.b = 8;
        this.d = nrw0Var;
        this.c = ref$ObjectRef;
    }
}
