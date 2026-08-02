package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.biometric.auth.api.domain.model.AuthMode;
import com.vk.biometrics.lock.api.domain.model.PinLockLaunchMode;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricsLockPinFragment;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.domain.model.PinLockLogoutReason;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.AudioBookListItemViewStyle;
import com.vk.catalog2.common.dto.api.style.AudioBookSliderViewStyle;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookItem;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.core.preference.Preference;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.f;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$SecureLockUnlockType;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.voip.call_effects.beauty.BeautyFilterIntensity;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c2r0;
import xsna.ca9;
import xsna.d4e;
import xsna.dw6;
import xsna.gdn;
import xsna.hnd;
import xsna.ikv0;
import xsna.nz0;
import xsna.o0r0;
import xsna.o3v;
import xsna.o97;
import xsna.or2;
import xsna.q97;
import xsna.r4q0;
import xsna.tj50;
import xsna.xn50;
import xsna.xyj;
import xsna.yre;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class lz0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lz0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CatalogViewStyle audioBookSliderViewStyle;
        MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType unlockType;
        MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType unlockType2;
        String b;
        int i = 4;
        int i2 = 11;
        int i3 = 12;
        int i4 = 6;
        int i5 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                return ((mz0) this.c).a.a((nz0.a) obj);
            case 1:
                q13 q13Var = (q13) this.c;
                float intValue = (-q13Var.d) - (((Integer) obj).intValue() / 2);
                for (View view : q13Var.b) {
                    if (view != null) {
                        view.setTranslationY(intValue);
                    }
                }
                Iterator<T> it = q13Var.c.iterator();
                while (it.hasNext()) {
                    ((u980) it.next()).a();
                }
                return s3q0.a;
            case 2:
                AttachVideoFragment attachVideoFragment = (AttachVideoFragment) this.c;
                int i7 = AttachVideoFragment.F0;
                attachVideoFragment.wo(new igq0((VideoAlbum) obj));
                return s3q0.a;
            case 3:
                bi20 bi20Var = (bi20) this.c;
                AudioBook audioBook = (AudioBook) obj;
                CatalogViewType catalogViewType = bi20Var.d;
                Bundle bundle = bi20Var.p;
                if (catalogViewType == CatalogViewType.LIST) {
                    audioBookSliderViewStyle = new AudioBookListItemViewStyle(bundle.getString(CatalogCustomAttributes$Keys.STYLE.h()));
                } else {
                    String string = bundle.getString(CatalogCustomAttributes$Keys.STYLE.h());
                    AudioBookSliderViewStyle.Style.Companion.getClass();
                    audioBookSliderViewStyle = new AudioBookSliderViewStyle(AudioBookSliderViewStyle.Style.a.a(string));
                }
                return new UIBlockAudioBookItem(com.vk.catalog2.common.dto.api.ui.a.a(bi20Var.b(), null, null, null, null, null, audioBookSliderViewStyle, 7679), audioBook);
            case 4:
                BaseAvatarPickerActivity baseAvatarPickerActivity = (BaseAvatarPickerActivity) this.c;
                List<BaseAvatarPickerActivity.ImageSourceAction> list = BaseAvatarPickerActivity.f;
                int i8 = BaseAvatarPickerActivity.a.$EnumSwitchMapping$0[((BaseAvatarPickerActivity.ImageSourceAction) obj).ordinal()];
                if (i8 == 1) {
                    baseAvatarPickerActivity.U1();
                } else if (i8 == 2) {
                    baseAvatarPickerActivity.R1();
                } else {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseAvatarPickerActivity.setResult(-1, new Intent().putExtra("output", (Parcelable) null));
                    baseAvatarPickerActivity.finish();
                }
                return s3q0.a;
            case 5:
                final ta6 ta6Var = (ta6) this.c;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                return new View.OnClickListener() { // from class: xsna.pa6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object obj2 = ta6.this.o;
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        ((l0c) obj2).s(booleanValue);
                    }
                };
            case 6:
                dj6 dj6Var = (dj6) this.c;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = dj6Var.p;
                Bundle bundle2 = (signUpDataHolder != null ? signUpDataHolder : 0).K;
                if (bundle2 != null) {
                    m63.m(bundle2, authExternalFlowOutResponseDto.d());
                }
                lm90 lm90Var = (lm90) dj6Var.a;
                if (lm90Var != null) {
                    lm90Var.e();
                }
                return s3q0.a;
            case 7:
                cw6 cw6Var = (cw6) this.c;
                BeautyFilterIntensity beautyFilterIntensity = (BeautyFilterIntensity) obj;
                cw6Var.b.a(beautyFilterIntensity);
                synchronized (cw6Var) {
                    if (cw6Var.e.P0() == null) {
                        dw6.a aVar = dw6.a.a;
                    }
                    cw6Var.e.onNext(new dw6.b(beautyFilterIntensity, beautyFilterIntensity));
                }
                return s3q0.a;
            case 8:
                final BiometricsLockPinFragment biometricsLockPinFragment = (BiometricsLockPinFragment) this.c;
                ?? r0 = biometricsLockPinFragment.Z;
                ?? r4 = biometricsLockPinFragment.Y;
                ?? r6 = biometricsLockPinFragment.U;
                com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g gVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.g) obj;
                int i9 = BiometricsLockPinFragment.c0;
                if (gVar instanceof g.f) {
                    ((k47) r4.getValue()).d(biometricsLockPinFragment, new t6e0(biometricsLockPinFragment.getString(R.string.bl_enter_by_biometrics), new s6e0(biometricsLockPinFragment.getString(R.string.bl_cancel), true)), new vjk(AuthMode.DECRYPTION, null), Preference.f("biometrics_lock"), biometricsLockPinFragment);
                } else if (gVar instanceof g.b) {
                    g.b bVar = (g.b) gVar;
                    com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar = (com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c) biometricsLockPinFragment.b0.getValue();
                    n67 n67Var = biometricsLockPinFragment.X;
                    if (cVar instanceof c.e) {
                        ((v57) biometricsLockPinFragment.W.getValue()).c(false);
                        long currentTimeMillis = System.currentTimeMillis();
                        ((p97) biometricsLockPinFragment.V.getValue()).l(currentTimeMillis);
                        n67Var.a().onNext(new q97.e());
                        n67Var.a().onNext(new q97.i(currentTimeMillis));
                        n67Var.e();
                        biometricsLockPinFragment.finish();
                    } else if (!(cVar instanceof c.d)) {
                        biometricsLockPinFragment.finish();
                    } else if (bVar.a) {
                        n67Var.a().onNext(q97.b.a);
                        biometricsLockPinFragment.finish();
                    } else {
                        biometricsLockPinFragment.finish();
                    }
                } else if (gVar instanceof g.d) {
                    biometricsLockPinFragment.finish();
                    if (((k47) r4.getValue()).b(biometricsLockPinFragment.requireContext())) {
                        ((b87) r6.getValue()).d(biometricsLockPinFragment.requireContext());
                    } else {
                        ((b87) r6.getValue()).a(biometricsLockPinFragment.requireContext());
                    }
                } else if (gVar instanceof g.e) {
                    boolean z = ((g.e) gVar).a;
                    biometricsLockPinFragment.finish();
                    if (z) {
                        biometricsLockPinFragment.getParentFragmentManager().k0(Bundle.EMPTY, "biometricsLockPinChanged");
                    }
                } else if (gVar instanceof g.c) {
                    biometricsLockPinFragment.finish();
                    ((b87) r6.getValue()).e(biometricsLockPinFragment.requireContext(), PinLockLaunchMode.NEW_PASSWORD);
                } else if (gVar instanceof g.a) {
                    biometricsLockPinFragment.getFeature().C(new a.m(biometricsLockPinFragment.T, System.currentTimeMillis()));
                    biometricsLockPinFragment.getFeature().C(new a.f(o3v.a.a));
                    final PinLockLogoutReason pinLockLogoutReason = ((g.a) gVar).a;
                    ver0.b(biometricsLockPinFragment.kn(), hg1.m(sa30.b(new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.a77
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i10 = BiometricsLockPinFragment.c0;
                            Iterator it2 = j5g.y0(o25.a().g()).iterator();
                            while (it2.hasNext()) {
                                o25.a().O(new t200(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (UserId) it2.next(), pinLockLogoutReason.h(), null, false, true, false));
                            }
                            r55 r55Var = r55.a;
                            c2r0 j = r55.j();
                            BiometricsLockPinFragment biometricsLockPinFragment2 = BiometricsLockPinFragment.this;
                            Iterator<T> it3 = ((yui) j).h(biometricsLockPinFragment2.requireContext(), false).iterator();
                            while (it3.hasNext()) {
                                yui yuiVar = (yui) j;
                                yuiVar.b(biometricsLockPinFragment2.requireContext(), ((c2r0.b) it3.next()).a);
                            }
                            return s3q0.a;
                        }
                    })), biometricsLockPinFragment.kn(), 0L, false, 62).subscribe(new oz(new po1(biometricsLockPinFragment, 7), i)));
                } else if (gVar instanceof j77) {
                    biometricsLockPinFragment.getFeature().C(new a.n(((j77) gVar).a));
                } else if (gVar instanceof i77) {
                    Toast.makeText(biometricsLockPinFragment.requireContext(), biometricsLockPinFragment.getString(R.string.bl_backoff_alert), 0).show();
                } else {
                    if (!(gVar instanceof g.C0428g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    g.C0428g c0428g = (g.C0428g) gVar;
                    r4q0 r4q0Var = c0428g.a;
                    r4q0 r4q0Var2 = c0428g.a;
                    if (r4q0Var instanceof r4q0.b) {
                        r4q0.b bVar2 = (r4q0.b) r4q0Var2;
                        ((n97) r0.getValue()).getClass();
                        int i10 = bVar2.a;
                        int i11 = o97.a.$EnumSwitchMapping$0[bVar2.b.ordinal()];
                        if (i11 == 1) {
                            unlockType2 = MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType.PASSWORD;
                        } else {
                            if (i11 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            unlockType2 = MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType.BIOMETRICS;
                        }
                        new q2i0(MobileOfficialAppsCoreNavStat$EventScreen.BIOMETRICS_LOCK_PIN, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem(MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.Type.TYPE_SECURE_LOCK_SUCCESS_ENTRANCE_ITEM, new MobileOfficialAppsCoreSecureStat$TypeSecureLockSuccessEntranceItem(i10, new MobileOfficialAppsCoreSecureStat$SecureLockUnlockType(unlockType2)), null, 4, null), 3)).q();
                    }
                    if (r4q0Var2 instanceof r4q0.a) {
                        r4q0.a aVar2 = (r4q0.a) r4q0Var2;
                        ((n97) r0.getValue()).getClass();
                        int i12 = aVar2.a;
                        int i13 = o97.a.$EnumSwitchMapping$0[aVar2.b.ordinal()];
                        if (i13 == 1) {
                            unlockType = MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType.PASSWORD;
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            unlockType = MobileOfficialAppsCoreSecureStat$SecureLockUnlockType.UnlockType.BIOMETRICS;
                        }
                        new q2i0(MobileOfficialAppsCoreNavStat$EventScreen.BIOMETRICS_LOCK_PIN, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem(MobileOfficialAppsCoreSecureStat$TypeSecureLockEntranceItem.Type.TYPE_SECURE_LOCK_FAILURE_ENTRANCE_ITEM, null, new MobileOfficialAppsCoreSecureStat$TypeSecureLockFailureEntranceItem(new MobileOfficialAppsCoreSecureStat$SecureLockFailureAttempts(i12, new MobileOfficialAppsCoreSecureStat$SecureLockUnlockType(unlockType)), aVar2.c, aVar2.d), 2, null), 3)).q();
                    }
                }
                return s3q0.a;
            case 9:
                BlacklistFragment blacklistFragment = (BlacklistFragment) this.c;
                com.vk.feed.blacklist.impl.presentation.blacklist.f fVar = (com.vk.feed.blacklist.impl.presentation.blacklist.f) obj;
                if (fVar instanceof f.a.C1034a) {
                    ((o0r0) blacklistFragment.R.getValue()).m(blacklistFragment.kn(), ((f.a.C1034a) fVar).a, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else {
                    int i14 = BlacklistFragment.V;
                    if (fVar instanceof f.b.a) {
                        j03.l(((f.b.a) fVar).a);
                    } else {
                        if (!(fVar instanceof f.b.C1035b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f.b.C1035b c1035b = (f.b.C1035b) fVar;
                        UserProfile userProfile = c1035b.c;
                        String string2 = userProfile != null ? userProfile.K().booleanValue() ? blacklistFragment.getString(R.string.unban_success_message_f, userProfile.d) : blacklistFragment.getString(R.string.unban_success_message_m, userProfile.d) : blacklistFragment.getString(R.string.unban_success_message_group);
                        Context requireContext = blacklistFragment.requireContext();
                        ikv0.a aVar3 = new ikv0.a(requireContext);
                        aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
                        aVar3.u = new ikv0.d(string2, (String) null, (ikv0.d.a) null, 6);
                        aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext.getString(R.string.cancel), new m9(i6, blacklistFragment, c1035b));
                        aVar3.n();
                    }
                }
                return s3q0.a;
            case 10:
                whr0 whr0Var = (whr0) this.c;
                ca9.c cVar2 = (ca9.c) obj;
                HashMap hashMap = new HashMap();
                hashMap.putAll(cVar2.m);
                hashMap.put(whr0Var.a, whr0Var);
                s3q0 s3q0Var = s3q0.a;
                return ca9.c.a(cVar2, hashMap, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -4097, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 11:
                i0q0.f(new p5(5, (or2.a.InterfaceC3466a) this.c, (String) obj));
                return s3q0.a;
            case 12:
                i5b i5bVar = (i5b) this.c;
                zk70.e((Throwable) obj);
                r5b Y0 = i5bVar.Y0();
                Y0.l.removeCallbacksAndMessages(Y0.m);
                RecyclerView recyclerView = Y0.h;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setVisibility(4);
                RecyclerView recyclerView2 = Y0.h;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.stopScroll();
                View view2 = Y0.i;
                if (view2 == null) {
                    view2 = null;
                }
                view2.setVisibility(4);
                View view3 = Y0.j;
                if (view3 == null) {
                    view3 = null;
                }
                view3.setVisibility(4);
                DefaultErrorView defaultErrorView = Y0.k;
                if (defaultErrorView == null) {
                    defaultErrorView = null;
                }
                if (f4m.g(defaultErrorView)) {
                    DefaultErrorView defaultErrorView2 = Y0.k;
                    d3m.c(defaultErrorView2 == null ? null : defaultErrorView2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                DefaultErrorView defaultErrorView3 = Y0.k;
                (defaultErrorView3 != null ? defaultErrorView3 : null).setVisibility(0);
                return s3q0.a;
            case 13:
                return new w7b(new VkCell(((ViewGroup) obj).getContext(), r9, i4, i5), ((o7b) this.c).i);
            case 14:
                ((rkb) this.c).d.c((Throwable) obj, new fc(6));
                return s3q0.a;
            case 15:
                ((w6d) this.c).e.a(j5d.b);
                return s3q0.a;
            case 16:
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) obj;
                u9 u9Var = ((bbd) this.c).f;
                if (u9Var != null) {
                    u9Var.invoke(marketProductTileConfig);
                }
                return s3q0.a;
            case 17:
                s3q0 s3q0Var2 = (s3q0) obj;
                vhk0.b((File) ((Ref$ObjectRef) this.c).element);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Story upload task is running " + s3q0Var2});
                }
                return s3q0.a;
            case 18:
                ((hnd.d) this.c).a.invoke();
                return s3q0.a;
            case 19:
                if (!epx.f(((ClipsEntryPointDraftsFragment) this.c).U, (List) obj)) {
                    wjs0.a(qwr0.a);
                }
                return s3q0.a;
            case 20:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) this.c).T(new c.C0600c(((d4e.a.f) obj).a));
                return s3q0.a;
            case 21:
                tj50.a aVar4 = (tj50.a) obj;
                xre xreVar = (xre) ((sre) this.c).d.getValue();
                xreVar.getClass();
                wre wreVar = new wre(xreVar);
                ao8 ao8Var = ao8.d;
                int i15 = 10;
                return new yre.a.C4132a(aVar4.a(new zj(13), ao8Var), aVar4.a(new sc(xreVar, i15), ao8Var), aVar4.a(wreVar, ao8Var), aVar4.a(new oj(8), ao8Var), aVar4.a(new f57(i4), ao8Var), aVar4.a(new tc(i15), ao8Var), aVar4.a(new wr0(i15), ao8Var), aVar4.a(new xr0(xreVar), ao8Var), aVar4.a(new sd4(i2), ao8Var), aVar4.a(new z13(i4), ao8Var), aVar4.a(new od3(12), ao8Var), aVar4.a(new pl2(i3), ao8Var));
            case 22:
                return new Pair((ClipVideoFile) this.c, (List) obj);
            case 23:
                return new j2j((ViewGroup) obj, (nvg) this.c);
            case 24:
                ((izj) this.c).a.a(xyj.j.b.b);
                return s3q0.a;
            case 25:
                izs izsVar = (izs) this.c;
                Integer num = (Integer) obj;
                num.intValue();
                izsVar.invoke(num);
                return s3q0.a;
            case 26:
                ArrayList arrayList = (ArrayList) this.c;
                Map map = (Map) obj;
                nlk nlkVar = nlk.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    CallMemberId callMemberId = (CallMemberId) it2.next();
                    whr0 whr0Var2 = (whr0) map.get(callMemberId.b);
                    if (whr0Var2 != null) {
                        String str = whr0Var2.t;
                        String str2 = whr0Var2.s;
                        String str3 = whr0Var2.q;
                        if (str3 == null || str3.length() == 0) {
                            nlkVar.getClass();
                            b = nlk.b(str2, str);
                        } else {
                            b = rte0.r(str3);
                            if (b == null) {
                                nlkVar.getClass();
                                b = nlk.b(str2, str);
                            }
                        }
                        nlk.e.put(callMemberId, new Pair<>(b, Long.valueOf(elapsedRealtime)));
                    }
                }
                nlkVar.getClass();
                nlk.c();
                return s3q0.a;
            case 27:
                ((ProgressWheel) obj).setBarColor(((kkm) this.c).f(R.attr.vk_legacy_accent));
                return s3q0.a;
            case 28:
                rtm rtmVar = (rtm) this.c;
                if (rtmVar.f.incrementAndGet() == 1) {
                    rtmVar.e.b(rtmVar.a.l.a().a0(rtmVar.g).subscribe(new defpackage.x(new ifg(rtmVar, i2), 19)));
                }
                return s3q0.a;
            default:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) this.c;
                int i16 = DisplayAudioBookChaptersFragment.b0;
                if (((yj40) obj) instanceof gg4) {
                    xn50.a.c(displayAudioBookChaptersFragment, gdn.d.b.b);
                }
                return s3q0.a;
        }
    }
}
