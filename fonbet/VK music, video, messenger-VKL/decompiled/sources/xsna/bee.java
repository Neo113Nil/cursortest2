package xsna;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.wall.dto.WallAttachmentsConfigCarouselDto;
import com.vk.api.generated.wall.dto.WallAttachmentsConfigCarouselRatioDto;
import com.vk.api.generated.wall.dto.WallAttachmentsConfigDefaultItemDto;
import com.vk.api.generated.wall.dto.WallAttachmentsConfigExceptionDto;
import com.vk.api.generated.wall.dto.WallAttachmentsConfigExceptionItemDto;
import com.vk.api.generated.wall.dto.WallGetAttachmentsConfigResponseDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentStyleDto;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.common.links.LinksParserData;
import com.vk.dto.attaches.AttachDisplayConfig;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.common.Image;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;
import com.vk.superapp.api.states.VkAuthState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.t6k0;
import xsna.v6k0;

/* compiled from: ClipsGridPresenter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class bee extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bee(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WallAttachmentsConfigCarouselRatioDto d;
        WallAttachmentsConfigCarouselRatioDto d2;
        String str;
        String str2;
        v6k0 v6k0Var;
        switch (this.b) {
            case 0:
                com.vk.clips.viewer.impl.grid.b bVar = (com.vk.clips.viewer.impl.grid.b) this.receiver;
                bVar.getClass();
                mce mceVar = new mce((ClipGridParams) obj, new ngj0());
                bVar.B = mceVar;
                return mceVar;
            case 1:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                c6e0 c6e0Var = (c6e0) obj;
                y5e0 y5e0Var = (y5e0) this.receiver;
                VKImageView vKImageView = y5e0Var.f;
                VKImageView vKImageView2 = y5e0Var.g;
                VKCircleImageView vKCircleImageView = y5e0Var.h;
                bwt0.i0(y5e0Var.k, new arb0(y5e0Var, 7));
                Button button = y5e0Var.l;
                bwt0.i0(button, new na7(23, y5e0Var, c6e0Var));
                PromoInfo promoInfo = c6e0Var.b;
                TextView textView = y5e0Var.i;
                String str3 = promoInfo.b;
                Image image = promoInfo.f;
                textView.setText(str3);
                button.setText(promoInfo.d.b);
                y5e0Var.j.setText(xwk.d().a().d(promoInfo.c, new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) new nh40(y5e0Var, 10), 0, (taz) null, false, 15359)));
                Image image2 = promoInfo.e;
                if (image2 == null || image == null) {
                    bwt0.p0(vKCircleImageView, false);
                    bwt0.p0(vKImageView2, false);
                    bwt0.p0(vKImageView, true);
                    bwt0.L(vKImageView, image2);
                } else {
                    bwt0.p0(vKCircleImageView, true);
                    bwt0.p0(vKImageView2, true);
                    bwt0.p0(vKImageView, false);
                    bwt0.L(vKCircleImageView, image2);
                    bwt0.L(vKImageView2, image);
                }
                return s3q0.a;
            case 4:
                ((j2r0) this.receiver).getClass();
                return j2r0.a((UsersUserFullDto) obj);
            case 5:
                WallGetAttachmentsConfigResponseDto wallGetAttachmentsConfigResponseDto = (WallGetAttachmentsConfigResponseDto) obj;
                ((m9x0) this.receiver).getClass();
                List<WallAttachmentsConfigExceptionDto> f = wallGetAttachmentsConfigResponseDto.f();
                if (f == null) {
                    f = EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = f.iterator();
                while (it.hasNext()) {
                    List<WallAttachmentsConfigExceptionItemDto> d3 = ((WallAttachmentsConfigExceptionDto) it.next()).d();
                    if (d3 != null) {
                        arrayList.add(d3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    List<WallAttachmentsConfigExceptionItemDto> list = (List) it2.next();
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    for (WallAttachmentsConfigExceptionItemDto wallAttachmentsConfigExceptionItemDto : list) {
                        arrayList3.add(new AttachDisplayConfig(wallAttachmentsConfigExceptionItemDto.getType(), Collections.singletonList(wallAttachmentsConfigExceptionItemDto.d().i())));
                    }
                    arrayList2.add(arrayList3);
                }
                List<String> g = wallGetAttachmentsConfigResponseDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                List<String> list2 = g;
                int e = on00.e(c5g.u(list2, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (String str4 : list2) {
                    linkedHashMap.put(str4, new AttachDisplayConfig(str4, Collections.singletonList("full")));
                }
                List<WallAttachmentsConfigDefaultItemDto> e2 = wallGetAttachmentsConfigResponseDto.e();
                if (e2 == null) {
                    e2 = EmptyList.b;
                }
                List<WallAttachmentsConfigDefaultItemDto> list3 = e2;
                ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                for (WallAttachmentsConfigDefaultItemDto wallAttachmentsConfigDefaultItemDto : list3) {
                    String type = wallAttachmentsConfigDefaultItemDto.getType();
                    List<WallWallpostAttachmentStyleDto> d4 = wallAttachmentsConfigDefaultItemDto.d();
                    ArrayList arrayList5 = new ArrayList(c5g.u(d4, 10));
                    Iterator<T> it3 = d4.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((WallWallpostAttachmentStyleDto) it3.next()).i());
                    }
                    arrayList4.add(new AttachDisplayConfig(type, arrayList5));
                }
                WallAttachmentsConfigCarouselDto d5 = wallGetAttachmentsConfigResponseDto.d();
                Float e3 = (d5 == null || (d2 = d5.d()) == null) ? null : d2.e();
                WallAttachmentsConfigCarouselDto d6 = wallGetAttachmentsConfigResponseDto.d();
                Float d7 = (d6 == null || (d = d6.d()) == null) ? null : d.d();
                return new AttachmentsArrangementConfig(System.currentTimeMillis(), arrayList2, linkedHashMap, arrayList4, (e3 == null || d7 == null) ? new CarouselRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null) : new CarouselRatio(e3.floatValue(), d7.floatValue()));
            case 6:
                t6k0 t6k0Var = (t6k0) obj;
                s6k0 s6k0Var = (s6k0) this.receiver;
                String string = s6k0Var.b.getString(R.string.vk_sms_inbox_confirm_another_way_subtitle);
                if (t6k0Var instanceof t6k0.c) {
                    v6k0Var = s6k0Var.C;
                    if (!(v6k0Var instanceof v6k0.b) && !(v6k0Var instanceof v6k0.a)) {
                        v6k0Var = v6k0.c.a;
                    }
                } else if (t6k0Var instanceof t6k0.a) {
                    t6k0.a aVar = (t6k0.a) t6k0Var;
                    String str5 = aVar.a;
                    if (str5 != null) {
                        string = str5;
                    }
                    v6k0Var = new v6k0.a(string, aVar.b, aVar.c);
                } else {
                    if (!(t6k0Var instanceof t6k0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str6 = ((t6k0.b) t6k0Var).a;
                    CheckPresenterInfo checkPresenterInfo = s6k0Var.y;
                    if (checkPresenterInfo instanceof CheckPresenterInfo.Auth) {
                        VkAuthState vkAuthState = ((CheckPresenterInfo.Auth) checkPresenterInfo).b;
                        vkAuthState.d.put("code", str6);
                        p66.j0(s6k0Var, vkAuthState, null, null, null, 30);
                    } else {
                        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
                            VerificationScreenData verificationScreenData = ((CheckPresenterInfo.SignUp) checkPresenterInfo).b;
                            VerificationScreenData.Phone phone = verificationScreenData instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData : null;
                            if (phone != null) {
                                str = phone.b;
                                str2 = str;
                            }
                            str2 = null;
                        } else if (checkPresenterInfo instanceof CheckPresenterInfo.PasswordLessAuth) {
                            VerificationScreenData verificationScreenData2 = ((CheckPresenterInfo.PasswordLessAuth) checkPresenterInfo).b;
                            VerificationScreenData.Phone phone2 = verificationScreenData2 instanceof VerificationScreenData.Phone ? (VerificationScreenData.Phone) verificationScreenData2 : null;
                            if (phone2 != null) {
                                str = phone2.b;
                                str2 = str;
                            }
                            str2 = null;
                        } else {
                            if (checkPresenterInfo instanceof CheckPresenterInfo.Validation) {
                                str = ((CheckPresenterInfo.Validation) checkPresenterInfo).b;
                                str2 = str;
                            }
                            str2 = null;
                        }
                        v2j v2jVar = new v2j(str2, s6k0Var.x, str6, null, null, "sms_inbox", false);
                        if (checkPresenterInfo != null) {
                            s6k0Var.D.getClass();
                            mnh0.B(z2a0.c(checkPresenterInfo, v2jVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()), s6k0Var.s, new jp5(24, s6k0Var, checkPresenterInfo), new n9b(s6k0Var, 8), null);
                        }
                    }
                    v6k0Var = v6k0.b.a;
                }
                s6k0Var.y0(v6k0Var);
                return s3q0.a;
            default:
                com.vk.superapp.verification.account.f.k((com.vk.superapp.verification.account.f) this.receiver, (Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bee(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 4:
                super(1, obj, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0);
                break;
            default:
                break;
        }
    }
}
