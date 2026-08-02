package xsna;

import com.vk.api.generated.audio.dto.AudioRestrictionDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.api.generated.auth.dto.AuthInitPasswordCheckResponseDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthErrorType;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerFragment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.log.L;
import com.vk.newsfeed.posting.additional_settings.presentation.base.fragment.AdditionalSettingsFragment;
import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;
import com.vk.voip.VoipCallActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.m8j0;
import xsna.rdm0;
import xsna.x7j0;
import xsna.xn50;

/* compiled from: AdditionalSettingsFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class qr0 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        ArrayList arrayList;
        Object obj3;
        ArrayList arrayList2;
        InitPasswordCheckResponse.AccessFactor accessFactor;
        InitPasswordCheckResponse.AccessFactor2 accessFactor2;
        m8j0 m8j0Var;
        Object obj4;
        Iterator it;
        boolean z;
        switch (this.b) {
            case 0:
                AdditionalSettingsFragment additionalSettingsFragment = (AdditionalSettingsFragment) this.receiver;
                additionalSettingsFragment.getClass();
                xn50.a.c(additionalSettingsFragment, (kq0) obj);
                return s3q0.a;
            case 1:
                kw4 kw4Var = (kw4) obj;
                ((jw4) this.receiver).getClass();
                Iterator<E> it2 = AudioRestrictionDto.i().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((AudioRestrictionDto) obj2).j() == kw4Var.a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                AudioRestrictionDto audioRestrictionDto = (AudioRestrictionDto) obj2;
                String str = kw4Var.b;
                String str2 = kw4Var.c;
                Image image = kw4Var.d;
                if (image == null || (arrayList2 = image.b) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ImageSize imageSize = (ImageSize) it3.next();
                        com.vk.dto.common.im.Image image2 = imageSize.d;
                        arrayList3.add(new BaseImageDto(image2.d, image2.b, image2.c, null, null, Boolean.valueOf(imageSize.c7()), 24, null));
                    }
                    arrayList = arrayList3;
                }
                Iterator<E> it4 = BaseLinkButtonActionTypeDto.i().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj3 = it4.next();
                        if (epx.f(((BaseLinkButtonActionTypeDto) obj3).j(), kw4Var.g)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto = (BaseLinkButtonActionTypeDto) obj3;
                return new AudioRestrictionInfoDto(audioRestrictionDto, str, str2, new BaseLinkButtonDto(baseLinkButtonActionTypeDto != null ? new BaseLinkButtonActionDto(baseLinkButtonActionTypeDto, null, null, null, null, null, null, null, null, null, kw4Var.f, null, null, null, null, null, null, null, null, 523262, null) : null, null, kw4Var.e, null, null, null, null, null, null, null, null, null, null, null, null, 32762, null), arrayList);
            case 2:
                ClipsFavoritesFoldersPickerFragment clipsFavoritesFoldersPickerFragment = (ClipsFavoritesFoldersPickerFragment) this.receiver;
                clipsFavoritesFoldersPickerFragment.getClass();
                xn50.a.c(clipsFavoritesFoldersPickerFragment, (com.vk.clips.favorites.impl.ui.folders.picker.a) obj);
                return s3q0.a;
            case 3:
                ((yhe) this.receiver).getClass();
                return new e2f(false, true, (List) obj);
            case 4:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 5:
                ((bbp) this.receiver).a((uap) obj);
                return s3q0.a;
            case 6:
                AuthInitPasswordCheckResponseDto authInitPasswordCheckResponseDto = (AuthInitPasswordCheckResponseDto) obj;
                ((qp) this.receiver).getClass();
                InitPasswordCheckResponse.AccessFactor.a aVar = InitPasswordCheckResponse.AccessFactor.Companion;
                String i = authInitPasswordCheckResponseDto.d().i();
                aVar.getClass();
                InitPasswordCheckResponse.AccessFactor[] values = InitPasswordCheckResponse.AccessFactor.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        accessFactor = values[i2];
                        if (!epx.f(accessFactor.h(), i)) {
                            i2++;
                        }
                    } else {
                        accessFactor = null;
                    }
                }
                if (accessFactor == null) {
                    throw new IllegalStateException("Flow state can't be null");
                }
                AuthInitPasswordCheckResponseDto.AccessFactor2Dto e = authInitPasswordCheckResponseDto.e();
                if (e != null) {
                    InitPasswordCheckResponse.AccessFactor2.a aVar2 = InitPasswordCheckResponse.AccessFactor2.Companion;
                    String i3 = e.i();
                    aVar2.getClass();
                    for (InitPasswordCheckResponse.AccessFactor2 accessFactor22 : InitPasswordCheckResponse.AccessFactor2.values()) {
                        if (epx.f(accessFactor22.h(), i3)) {
                            accessFactor2 = accessFactor22;
                            return new InitPasswordCheckResponse(accessFactor, accessFactor2);
                        }
                    }
                }
                accessFactor2 = null;
                return new InitPasswordCheckResponse(accessFactor, accessFactor2);
            case 7:
                lpt0 lpt0Var = (lpt0) obj;
                ((wbx) this.receiver).f.put(lpt0Var.a, lpt0Var);
                return s3q0.a;
            case 8:
                ((wn50) this.receiver).j((yn50) obj);
                return s3q0.a;
            case 9:
                ((dv60) this.receiver).a((r070) obj);
                return s3q0.a;
            case 10:
                Throwable th = (Throwable) obj;
                com.vk.auth.modal.qrwithcode.a aVar3 = (com.vk.auth.modal.qrwithcode.a) this.receiver;
                aVar3.getClass();
                xgx0.a.getClass();
                xgx0.d(th);
                aVar3.e(new b.c(((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) ? QrWithCodeAuthErrorType.NoInternet : QrWithCodeAuthErrorType.Generic), true);
                return s3q0.a;
            case 11:
                c9j0 c9j0Var = (c9j0) obj;
                u8j0 u8j0Var = (u8j0) this.receiver;
                u8j0Var.getClass();
                UserId userId = c9j0Var.b;
                ListBuilder e2 = e43.e();
                gpj0 gpj0Var = u8j0Var.d;
                e2.add(new rdm0.b(gpj0Var.getUid().b, gpj0Var.a(), gpj0Var.e(), epx.f(userId, gpj0Var.getUid()), new x7j0.a(null), (String) null, 96));
                List<Group> list = c9j0Var.f;
                for (Group group : list) {
                    UserId userId2 = group.c;
                    e2.add(new rdm0.b(userId2.b, group.e, group.d, epx.f(userId, userId2), new x7j0.a(group), (String) null, 96));
                }
                ListBuilder g = e2.g();
                ListBuilder e3 = e43.e();
                e3.add(rdm0.a.b);
                List<Narrative> list2 = c9j0Var.g.get(userId);
                if (list2 != null) {
                    List<Narrative> list3 = list2;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        Narrative narrative = (Narrative) it5.next();
                        long j = narrative.b;
                        HighlightCover highlightCover = narrative.e;
                        String f = highlightCover != null ? highlightCover.f() : null;
                        String str3 = narrative.d;
                        Set<Narrative> set = c9j0Var.h.get(userId);
                        if (set != null) {
                            it = it5;
                            if (set.contains(narrative)) {
                                z = true;
                                e3.add(new rdm0.b(j, f, str3, z, new x7j0.b(narrative), (String) null, 64));
                                arrayList4.add(Boolean.TRUE);
                                it5 = it;
                            }
                        } else {
                            it = it5;
                        }
                        z = false;
                        e3.add(new rdm0.b(j, f, str3, z, new x7j0.b(narrative), (String) null, 64));
                        arrayList4.add(Boolean.TRUE);
                        it5 = it;
                    }
                }
                ListBuilder g2 = e3.g();
                m8j0.a aVar4 = u8j0Var.e ? new m8j0.a(userId, g) : null;
                boolean z2 = c9j0Var.i;
                String str4 = c9j0Var.j.get(userId);
                if (str4 == null) {
                    str4 = "0";
                }
                m8j0.c cVar = new m8j0.c(str4, g2, z2);
                if (fkq0.d(userId)) {
                    m8j0Var = m8j0.e.b;
                } else {
                    if (fkq0.b(userId)) {
                        Iterator<T> it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj4 = it6.next();
                                if (epx.f(((Group) obj4).c, userId)) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        Group group2 = (Group) obj4;
                        if (group2 != null && group2.q0) {
                            m8j0Var = new m8j0.g(c9j0Var.k.getOrDefault(userId, Boolean.TRUE).booleanValue());
                        }
                    }
                    m8j0Var = m8j0.f.b;
                }
                return rl3.I(new m8j0[]{aVar4, cVar, m8j0Var, m8j0.d.b});
            case 12:
                fmq0 fmq0Var = (fmq0) this.receiver;
                fmq0Var.getClass();
                return rli0.A(new ulp0(rli0.t(new fhn(new auw(new i5g((List) obj)), new kl60(22)), new ksg0(fmq0Var, 14)), new jvl0(6)));
            case 13:
                ((u8r0) this.receiver).getClass();
                return u8r0.l((ke3) obj);
            case 14:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VoipCallActivity voipCallActivity = (VoipCallActivity) this.receiver;
                int i4 = VoipCallActivity.P;
                voipCallActivity.getClass();
                L.A("VoipCallActivity", "finishCall declineOrHang");
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 500L, booleanValue, false, true, null, 197);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(Object obj, int i) {
        super(1, obj, jw4.class, "entityToDto", "entityToDto(Lcom/vk/music/offline/core/database/entity/AudioRestrictionEntity;)Lcom/vk/api/generated/audio/dto/AudioRestrictionInfoDto;", 0);
        this.b = i;
        switch (i) {
            case 8:
                super(1, obj, wn50.class, "onViewEvent", "onViewEvent(Lcom/vk/im/mvicomponent/MviViewEvent;)V", 0);
                break;
            case 9:
                super(1, obj, dv60.class, "startTask", "startTask(Lcom/vk/mvi/MviTask;)V", 0);
                break;
            case 10:
            case 13:
            default:
                break;
            case 11:
                super(1, obj, u8j0.class, "buildItems", "buildItems(Lcom/vk/camera/editor/stories/impl/share/mvi/ShareStoryState;)Ljava/util/List;", 0);
                break;
            case 12:
                super(1, obj, fmq0.class, "mapPhotosToHeaderUrls", "mapPhotosToHeaderUrls(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 14:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 15:
                super(1, obj, VoipCallActivity.class, "finishCall", "finishCall(Z)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(qp qpVar) {
        super(1, qpVar, qp.class, "mapToInitPasswordCheckResponse", "mapToInitPasswordCheckResponse(Lcom/vk/api/generated/auth/dto/AuthInitPasswordCheckResponseDto;)Lcom/vk/superapp/api/dto/auth/InitPasswordCheckResponse;", 0);
        this.b = 6;
    }
}
