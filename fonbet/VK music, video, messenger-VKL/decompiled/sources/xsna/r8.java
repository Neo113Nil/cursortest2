package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.vk.api.generated.apps.dto.AppsGetEmbeddedUrlResponseDto;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.ui.dialog.CartCommunityMenuAction;
import com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.SelectGroupVerificationFragment;
import com.vk.ecomm.verifiedseller.impl.screens.verificationstub.VerificationStubFragment;
import com.vk.log.L;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketOrdersItem;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.b7k0;
import xsna.h7u0;
import xsna.lx9;
import xsna.rv9;
import xsna.tlo0;
import xsna.xn50;

/* compiled from: AboutVideoItemsLoader.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class r8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ModalActionSheetListItem modalActionSheetListItem;
        int i = 2;
        switch (this.b) {
            case 0:
                return t8.a((t8) this.receiver, (hfz) obj);
            case 1:
                ln0 ln0Var = (ln0) this.receiver;
                on0 on0Var = ln0Var.g1;
                Context requireContext = ln0Var.requireContext();
                mh mhVar = new mh(ln0Var, i);
                on0Var.getClass();
                on0.a(requireContext, (Throwable) obj, mhVar);
                return s3q0.a;
            case 2:
                return ((rw4) this.receiver).a((AudioRestrictionInfoDto) obj);
            case 3:
                lx9 lx9Var = (lx9) obj;
                final yw9 yw9Var = (yw9) this.receiver;
                izs<rv9, s3q0> izsVar = yw9Var.e;
                bpn0 bpn0Var = yw9Var.n;
                Context context = yw9Var.f;
                if (lx9Var instanceof lx9.c) {
                    yw9Var.d.kn().onBackPressed();
                } else {
                    int i2 = 1;
                    if (lx9Var instanceof lx9.k) {
                        lx9.k kVar = (lx9.k) lx9Var;
                        UserId userId = kVar.a;
                        List<CartCommunityMenuAction> list = kVar.b;
                        a.C0785a c0785a = new a.C0785a();
                        List<CartCommunityMenuAction> list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        for (CartCommunityMenuAction cartCommunityMenuAction : list2) {
                            int i3 = lpg.$EnumSwitchMapping$0[cartCommunityMenuAction.ordinal()];
                            if (i3 == 1) {
                                modalActionSheetListItem = new ModalActionSheetListItem(cartCommunityMenuAction.ordinal(), ModalActionSheetListItem.Appearance.Default, context.getString(R.string.ecomm_cart_subscribe_to_shop), null, null, R.drawable.vk_icon_add_square_outline_28, null, false, false, 472);
                            } else if (i3 == 2) {
                                modalActionSheetListItem = new ModalActionSheetListItem(cartCommunityMenuAction.ordinal(), ModalActionSheetListItem.Appearance.Default, context.getString(R.string.ecomm_cart_write_to_seller), null, null, R.drawable.vk_icon_write_outline_28, null, false, false, 472);
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                modalActionSheetListItem = new ModalActionSheetListItem(cartCommunityMenuAction.ordinal(), ModalActionSheetListItem.Appearance.Negative, context.getString(R.string.ecomm_cart_delete_all_products), null, null, R.drawable.vk_icon_delete_outline_28, null, false, false, 472);
                            }
                            arrayList.add(modalActionSheetListItem);
                        }
                        c0785a.b = arrayList;
                        c0785a.c = new ng3(11, izsVar, userId);
                        c0785a.a(context, null);
                    } else if (lx9Var instanceof lx9.l) {
                        b7k0 b7k0Var = ((lx9.l) lx9Var).a;
                        CharSequence a = tlo0.b.a(b7k0Var.a, context);
                        String obj2 = a != null ? a.toString() : null;
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        if (b7k0Var instanceof b7k0.a) {
                            yw9Var.f(R.drawable.vk_icon_error_circle_24, R.attr.vk_ui_icon_negative, obj2);
                        } else {
                            if (!(b7k0Var instanceof b7k0.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            yw9Var.f(R.drawable.vk_icon_check_square_outline_24, R.attr.vk_ui_icon_accent, obj2);
                        }
                    } else if (lx9Var instanceof lx9.m) {
                        lx9.m mVar = (lx9.m) lx9Var;
                        a.C0919a c0919a = mVar.a;
                        isq.b((isq) yw9Var.l.getValue(), yw9Var.f, new MarketFavable(c0919a.a, fkq0.e(c0919a.c), null, false, mVar.b, 8, null), new io7(i2, yw9Var, mVar), null, new td0(6, yw9Var, mVar), true, null, null, 448);
                    } else if (lx9Var instanceof lx9.e) {
                        rml0.a((rml0) yw9Var.j.getValue(), context, fkq0.e(((lx9.e) lx9Var).a), null, 28);
                    } else if (lx9Var instanceof lx9.a) {
                        final lx9.a aVar = (lx9.a) lx9Var;
                        int i4 = h7u0.p;
                        h7u0.a c = h7u0.b.c(context);
                        c.g0(R.string.ecomm_cart_clear_cart_confirmation);
                        c.U(R.string.ecomm_cart_clear_cart_are_you_sure);
                        c.c0(R.string.ecomm_cart_delete_button, new DialogInterface.OnClickListener() { // from class: xsna.xw9
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                yw9.this.e.invoke(new rv9.a.C3634a(aVar.a, null));
                            }
                        });
                        c.W(R.string.cancel, new o1c());
                        c.m();
                    } else if (lx9Var instanceof lx9.j) {
                        sz00 sz00Var = (sz00) yw9Var.i.getValue();
                        a.C0919a c0919a2 = ((lx9.j) lx9Var).a;
                        sz00Var.d(context, new qz00(c0919a2.a, fkq0.e(c0919a2.c), CommonMarketStat$TypeRefSource.CART, null, null, null, null, null, null, null, null, null, null, 1048568));
                    } else if (lx9Var instanceof lx9.d) {
                        ((f8c) yw9Var.g.getValue()).a(context, ((lx9.d) lx9Var).a, null);
                    } else if (lx9Var instanceof lx9.i) {
                        ((qdz) bpn0Var.getValue()).e().d(context, Uri.parse(((lx9.i) lx9Var).a), LaunchContext.A, null);
                    } else if (lx9Var instanceof lx9.n) {
                        pyb.b((pyb) yw9Var.k.getValue(), yw9Var.f, null, ((lx9.n) lx9Var).a, null, null, null, null, 33553402);
                    } else if (lx9Var instanceof lx9.b) {
                        lx9.b bVar = (lx9.b) lx9Var;
                        a.C0919a c0919a3 = bVar.a;
                        boolean z = bVar.b;
                        a.C0785a c0785a2 = new a.C0785a();
                        ListBuilder e = e43.e();
                        e.add(new xu20(context.getString(R.string.ecomm_cart_remove_product_confirmation), null, 0, null, 14));
                        if (z) {
                            e.add(new ModalActionSheetListItem(srd0.MoveToFavorite.ordinal(), ModalActionSheetListItem.Appearance.Default, context.getString(R.string.ecomm_cart_move_to_favorite), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
                        }
                        e.add(new ModalActionSheetListItem(srd0.Remove.ordinal(), ModalActionSheetListItem.Appearance.Negative, context.getString(R.string.ecomm_cart_remove_product), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
                        c0785a2.b = e.g();
                        c0785a2.c = new bi0(29, izsVar, c0919a3);
                        c0785a2.a(context, null);
                    } else if (lx9Var instanceof lx9.g) {
                        ((dhc) yw9Var.h.getValue()).c(context, new cgc(null, null, false, null, null, 262143));
                    } else if (lx9Var instanceof lx9.h) {
                        hy80 hy80Var = (hy80) yw9Var.m.getValue();
                        UiTracker uiTracker = UiTracker.a;
                        hy80Var.e(context, null, UiTracker.c(), CommonMarketStat$TypeMarketOrdersItem.Source.CART);
                    } else {
                        if (!(lx9Var instanceof lx9.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        maz.c(((qdz) bpn0Var.getValue()).e(), yw9Var.f, ((lx9.f) lx9Var).a, LaunchContext.A, null, null, 24);
                    }
                }
                return s3q0.a;
            case 4:
                ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext((Boolean) obj);
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                return ((gsh) this.receiver).a((ExtendedCommunityProfile) obj);
            case 7:
                DisplayMusicPlaylistFragment displayMusicPlaylistFragment = (DisplayMusicPlaylistFragment) this.receiver;
                displayMusicPlaylistFragment.getClass();
                xn50.a.c(displayMusicPlaylistFragment, (com.vk.music.playlist.display.domain.a) obj);
                return s3q0.a;
            case 8:
                ((v3v) this.receiver).getClass();
                return v3v.f((Attach) obj);
            case 9:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 10:
                t7i0 t7i0Var = (t7i0) obj;
                SelectGroupVerificationFragment selectGroupVerificationFragment = (SelectGroupVerificationFragment) this.receiver;
                qcy<Object>[] qcyVarArr = SelectGroupVerificationFragment.U;
                if (t7i0Var instanceof q7i0) {
                    selectGroupVerificationFragment.kn().onBackPressed();
                } else if (t7i0Var instanceof r7i0) {
                    maz.c((maz) selectGroupVerificationFragment.R.getValue(), selectGroupVerificationFragment.requireContext(), ((r7i0) t7i0Var).a, LaunchContext.A, null, null, 24);
                } else {
                    selectGroupVerificationFragment.getClass();
                    ?? r4 = selectGroupVerificationFragment.S;
                    if (!(t7i0Var instanceof s7i0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = ((s7i0) t7i0Var).a;
                    int hashCode = str.hashCode();
                    if (hashCode != -318452137) {
                        if (hashCode != 3016401) {
                            if (hashCode == 3344077 && str.equals("mark")) {
                                new VerificationStubFragment.a(VerificationStubFragment.class, null, null).l(selectGroupVerificationFragment);
                            }
                        } else if (str.equals("base")) {
                            wnr0 wnr0Var = (wnr0) r4.getValue();
                            Context requireContext2 = selectGroupVerificationFragment.requireContext();
                            SelectGroupVerificationFragment.SelectGroupVerificationArgs fo = selectGroupVerificationFragment.fo();
                            UserId userId2 = fo != null ? fo.b : null;
                            if (userId2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            wnr0Var.b(requireContext2, userId2, str);
                        }
                    } else if (str.equals("premium")) {
                        wnr0 wnr0Var2 = (wnr0) r4.getValue();
                        Context requireContext3 = selectGroupVerificationFragment.requireContext();
                        SelectGroupVerificationFragment.SelectGroupVerificationArgs fo2 = selectGroupVerificationFragment.fo();
                        UserId userId3 = fo2 != null ? fo2.b : null;
                        if (userId3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        wnr0Var2.b(requireContext3, userId3, str);
                    }
                }
                return s3q0.a;
            case 11:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 12:
                ((com.vk.metrics.eventtracking.b) this.receiver).q((Throwable) obj);
                return s3q0.a;
            default:
                AppsGetEmbeddedUrlResponseDto appsGetEmbeddedUrlResponseDto = (AppsGetEmbeddedUrlResponseDto) obj;
                ((q73) this.receiver).getClass();
                return new nex0(appsGetEmbeddedUrlResponseDto.e(), appsGetEmbeddedUrlResponseDto.d());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(Object obj, int i) {
        super(1, obj, ln0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, rw4.class, "map", "map(Lcom/vk/api/generated/audio/dto/AudioRestrictionInfoDto;)Lcom/vk/music/offline/configs/api/domain/model/AudioRestrictionInfo;", 0);
                break;
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logOrFail", "logOrFail(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
