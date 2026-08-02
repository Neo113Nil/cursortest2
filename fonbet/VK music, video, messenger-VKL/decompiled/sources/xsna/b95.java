package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.core.view.components.text.VkText;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.superapp.vkpay.checkout.feature.success.Status;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.ErrorState;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusActionStyle;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.kku0;
import xsna.u820;
import xsna.vav;
import xsna.vpc0;
import xsna.w9u;
import xsna.zhg;

/* compiled from: AuthorHeaderHeaderContent.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class b95 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b95(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 0;
        int i2 = 13;
        int i3 = 5;
        int i4 = 2;
        switch (this.b) {
            case 0:
                int intValue = ((Number) obj).intValue();
                ja5 ja5Var = (ja5) this.receiver;
                ((zak0) ja5Var.a).setValue(la5.a(ja5Var.a(), swe0.g(intValue, 0, Math.max(ja5Var.a().a, 1) - 1), 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                return s3q0.a;
            case 1:
                bwt0.p0(((wf8) this.receiver).r, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                n2k0 n2k0Var = (n2k0) obj;
                n3g n3gVar = (n3g) this.receiver;
                com.vk.photo.editor.ivm.d dVar = n3gVar.b;
                if (dVar == null) {
                    dVar = null;
                }
                bc0 i5 = n3g.i(dVar);
                if (i5 != null) {
                    c2g c2gVar = i5.g.a.get(n2k0Var);
                    if ((c2gVar != null ? c2gVar.i : null) != null) {
                        n3gVar.m(n2k0Var);
                        c5p c5pVar = n3gVar.f;
                        (c5pVar != null ? c5pVar : null).b(CollageStatEvent.p.a);
                    } else if (c2gVar == null || epx.f(n3gVar.h.get(n2k0Var), Boolean.TRUE)) {
                        n3gVar.m(null);
                        if (!n3gVar.g) {
                            n3gVar.g = true;
                            new Handler(Looper.getMainLooper()).postDelayed(new jk9(n3gVar, i4), 500L);
                            u3p u3pVar = n3gVar.d;
                            if (u3pVar == null) {
                                u3pVar = null;
                            }
                            u3pVar.a(new g84(i3, n3gVar, n2k0Var), new m3g(n3gVar, i));
                        }
                        c5p c5pVar2 = n3gVar.f;
                        (c5pVar2 != null ? c5pVar2 : null).b(CollageStatEvent.q.a);
                    }
                }
                return s3q0.a;
            case 4:
                tr90 tr90Var = (tr90) obj;
                w9u w9uVar = (w9u) this.receiver;
                kku0 kku0Var = w9uVar.j;
                if (tr90Var.b()) {
                    kku0Var.d(tr90Var.e, tr90Var.d, "v9u");
                } else {
                    v9u v9uVar = w9uVar.i;
                    if (w9u.a.$EnumSwitchMapping$0[tr90Var.b.ordinal()] == 1) {
                        Context mo2getContext = v9uVar.mo2getContext();
                        if (mo2getContext != null) {
                            kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext.getString(R.string.vk_pay_checkout_system_error_occured)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext.getString(R.string.vk_pay_checkout_failed_try_again), new l35(i2))));
                        }
                    } else {
                        Context mo2getContext2 = v9uVar.mo2getContext();
                        if (mo2getContext2 != null) {
                            kku0.a.a(kku0Var, new Status(new ErrorState(mo2getContext2.getString(R.string.vk_pay_checkout_something_wrong), mo2getContext2.getString(R.string.vk_pay_checkout_something_wrong_hint)), new ButtonAction(StatusActionStyle.PRIMARY, mo2getContext2.getString(R.string.vk_pay_checkout_failed_try_again), new l9(10))));
                        }
                    }
                }
                return s3q0.a;
            case 5:
                vav vavVar = (vav) obj;
                ((dvq) this.receiver).getClass();
                if (!(vavVar instanceof vav.c)) {
                    return u820.a.a;
                }
                vav.c cVar = (vav.c) vavVar;
                return new u820.b(cVar.c, cVar.d);
            case 6:
                float floatValue = ((Number) obj).floatValue();
                xcx xcxVar = (xcx) this.receiver;
                hv1 hv1Var = xcxVar.d;
                c4u0 c4u0Var = xcxVar.a;
                VkText vkText = c4u0Var.L;
                View view = c4u0Var.b;
                CharSequence text = vkText.getText();
                String format = String.format(Locale.US, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                if (!epx.f(text, format)) {
                    view.removeCallbacks(hv1Var);
                    view.postDelayed(hv1Var, 200L);
                    vkText.setText(format);
                    if (f4m.g(vkText)) {
                        d3m.c(c4u0Var.L, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                return s3q0.a;
            case 7:
                ((kz30) this.receiver).getClass();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 8:
                ((svn) this.receiver).getClass();
                return svn.a((UtilsDomainResolvedWithDataDto) obj);
            case 9:
                PostingState postingState = (PostingState) obj;
                ((vpc0) this.receiver).getClass();
                if (!(postingState instanceof PostingState.Editing)) {
                    return null;
                }
                MediaPickerState.SheetState sheetState = ((PostingState.Editing) postingState).f.g;
                int i6 = sheetState == null ? -1 : vpc0.a.$EnumSwitchMapping$0[sheetState.ordinal()];
                if (i6 == -1) {
                    return null;
                }
                if (i6 == 1) {
                    return 5;
                }
                if (i6 == 2) {
                    return 4;
                }
                if (i6 == 3) {
                    return 3;
                }
                throw new NoWhenBranchMatchedException();
            default:
                ((g6h0) this.receiver).c.b(new zhg.a((Throwable) obj));
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b95(Object obj, int i) {
        super(1, obj, ja5.class, "updateCurrentPage", "updateCurrentPage(I)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, n3g.class, "handleUserSlotClick", "handleUserSlotClick(Lcom/vk/photo/editor/features/collage/model/SlotId;)V", 0);
                break;
            case 4:
                super(1, obj, w9u.class, "handlePayByTokenResponse", "handlePayByTokenResponse(Lcom/vk/superapp/vkpay/checkout/api/dto/domain/PayOperation;)V", 0);
                break;
            case 5:
                super(1, obj, dvq.class, "transform", "transform(Lcom/vk/voip/ui/holiday_interaction/feature/HolidayInteractionFeatureState;)Lcom/vk/voip/ui/holiday_interaction/menu/MenuViewModel;", 0);
                break;
            case 6:
            case 7:
            case 8:
            default:
                break;
            case 9:
                super(1, obj, vpc0.class, "mapMediaPickerSheetNextState", "mapMediaPickerSheetNextState(Lcom/vk/newsfeed/posting/impl/domain/model/PostingState;)Ljava/lang/Integer;", 0);
                break;
            case 10:
                super(1, obj, g6h0.class, "showError", "showError(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }
}
