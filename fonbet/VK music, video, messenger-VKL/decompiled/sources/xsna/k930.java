package xsna;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.clips.viewer.impl.feed.view.bottomsheet.DisabledClickException;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.g8d;
import xsna.ikv0;
import xsna.z830;

/* compiled from: MoreMenuHelper.kt */
/* loaded from: classes17.dex */
public final class k930 implements e8d {
    public final g8d a;
    public final ClipsInterestsComponent b;
    public final gzs<zp50> c;
    public final bpn0 d;

    /* compiled from: MoreMenuHelper.kt */
    public final class a implements dz20 {
        public final ClipFeedTab b;
        public final e c;
        public final SdkClipVideoFile d;
        public final WeakReference<Activity> e;
        public boolean f;
        public boolean g;

        public a(Activity activity, ClipFeedTab clipFeedTab, e eVar, SdkClipVideoFile sdkClipVideoFile) {
            this.b = clipFeedTab;
            this.c = eVar;
            this.d = sdkClipVideoFile;
            this.e = new WeakReference<>(activity);
        }

        @Override // xsna.dz20
        public final void Ff(String str) {
            ww50<?> Y;
            ComponentCallbacks2 componentCallbacks2 = (Activity) this.e.get();
            if (componentCallbacks2 == null) {
                return;
            }
            ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
            if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                return;
            }
            Y.S(this.c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.dz20
        public final void Qc(String str) {
            ww50<?> Y;
            k930 k930Var = k930.this;
            g8d g8dVar = k930Var.a;
            Activity activity = this.e.get();
            if (activity == 0) {
                return;
            }
            ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                Y.H(this.c);
            }
            if (!this.f) {
                pih0 pih0Var = g8dVar.d;
                ki0 kd = pih0Var != null ? pih0Var.kd() : null;
                ClipFeedTab clipFeedTab = this.b;
                nme nmeVar = new nme(clipFeedTab, kd);
                MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype eventSubtype = MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.WITHOUT_REASONS;
                SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.HIDE;
                SchemeStat$TypeClipViewerItem.ScreenType b = fzc.b(clipFeedTab);
                SdkClipVideoFile sdkClipVideoFile = this.d;
                nme.a(eventSubtype, eventType, b, sdkClipVideoFile);
                nmeVar.b(sdkClipVideoFile);
                g8dVar.c.b(new f930(sdkClipVideoFile, new com.vk.movika.sdk.base.flow.binding.j(17, nmeVar, this)));
            }
            if (this.g) {
                FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
                if (supportFragmentManager != null) {
                    supportFragmentManager.l0("negative_feedback_configure_interests_key", (f5z) activity, new j930(k930Var, this, activity, supportFragmentManager));
                }
                k930Var.b.Rd().f().k(activity);
            }
        }
    }

    /* compiled from: MoreMenuHelper.kt */
    public static final class b implements fcn {
        public final /* synthetic */ Ref$ObjectRef<bkd> b;

        public b(Ref$ObjectRef<bkd> ref$ObjectRef) {
            this.b = ref$ObjectRef;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            bkd bkdVar = this.b.element;
            if (bkdVar != null) {
                bkdVar.dismiss();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    /* compiled from: MoreMenuHelper.kt */
    public static final class c implements dz20 {
        public final /* synthetic */ Activity b;
        public final /* synthetic */ b c;

        public c(Activity activity, b bVar) {
            this.b = activity;
            this.c = bVar;
        }

        @Override // xsna.dz20
        public final void Ff(String str) {
            ww50<?> Y;
            ComponentCallbacks2 componentCallbacks2 = this.b;
            ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
            if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                return;
            }
            Y.S(this.c);
        }

        @Override // xsna.dz20
        public final void Qc(String str) {
            ww50<?> Y;
            ComponentCallbacks2 componentCallbacks2 = this.b;
            ey50 ey50Var = componentCallbacks2 instanceof ey50 ? (ey50) componentCallbacks2 : null;
            if (ey50Var == null || (Y = ey50Var.Y()) == null) {
                return;
            }
            Y.H(this.c);
        }
    }

    /* compiled from: MoreMenuHelper.kt */
    public static final class d implements nkd {
        public final /* synthetic */ SdkClipVideoFile b;
        public final /* synthetic */ Activity c;

        /* compiled from: MoreMenuHelper.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipsBottomSheetSideEffectOptions.values().length];
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.CLIPS_AUTO_SUBTITLES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.NOT_INTERESTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.TRAFFIC_SAVING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.PIN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.UNPIN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.EDIT_PUBLICATION_DATE_ON_CHANGE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.DELAY_CLIP_PUBLISHED_NOW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.EDIT_DONE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.DO_NOT_SHOW_SIMILAR.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.HIDE_THIS_AUTHOR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.CONFIGURE_INTERESTS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.CANCEL.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.EDIT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.EDIT_PRIVACY_CLIP.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.REMOVE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.REMOVE_CLIP_COMMUNITY.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d(SdkClipVideoFile sdkClipVideoFile, Activity activity) {
            this.b = sdkClipVideoFile;
            this.c = activity;
        }

        @Override // xsna.nkd
        public final void a(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, SdkVideoFile sdkVideoFile) {
            int i = a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()];
            k930 k930Var = k930.this;
            switch (i) {
                case 1:
                    k930Var.a.c.b(z830.a.a);
                    return;
                case 2:
                    k930Var.a.c.b(h930.a);
                    return;
                case 3:
                    k930Var.a.c.b(z830.g.a);
                    return;
                case 4:
                    k930Var.a.c.b(z830.e.a);
                    return;
                case 5:
                    k930Var.a.c.b(z830.h.a);
                    return;
                case 6:
                    k930Var.a.c.b(z830.d.a);
                    return;
                case 7:
                    k930Var.a.c.b(z830.b.a);
                    return;
                case 8:
                    k930Var.a.c.b(z830.f.a);
                    return;
                case 9:
                    k930Var.a.c.b(z830.c.a);
                    return;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        @Override // xsna.nkd
        public final void b(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, Throwable th) {
            int i;
            g8d g8dVar = k930.this.a;
            if (th instanceof DisabledClickException) {
                if (!ci90.l(this.b)) {
                    switch (a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()]) {
                        case 14:
                            g8dVar.c.b(a930.a);
                            break;
                        case 15:
                            g8dVar.c.b(b930.a);
                            break;
                        case 16:
                            g8dVar.c.b(c930.a);
                            break;
                        case 17:
                            g8dVar.c.b(d930.a);
                            break;
                    }
                }
                switch (a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()]) {
                    case 14:
                    case 15:
                        i = R.string.clips_referral_program_disabled_edit_message;
                        break;
                    case 16:
                    case 17:
                        i = R.string.clips_referral_program_disabled_remove_message;
                        break;
                    default:
                        return;
                }
                Activity activity = this.c;
                ikv0.a aVar = new ikv0.a(activity);
                aVar.t = ikv0.c.b.a;
                aVar.u = new ikv0.d(new ikv0.d.c(activity.getString(i)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar.n();
            }
        }
    }

    /* compiled from: MoreMenuHelper.kt */
    public static final class e implements fcn {
        public final /* synthetic */ Ref$ObjectRef<ene> b;

        public e(Ref$ObjectRef<ene> ref$ObjectRef) {
            this.b = ref$ObjectRef;
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            ene eneVar = this.b.element;
            if (eneVar != null) {
                eneVar.dismiss();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public k930(g8d g8dVar, ClipsInterestsComponent clipsInterestsComponent, e4 e4Var, int i) {
        gzs gzsVar = (i & 8) != 0 ? i930.b : e4Var;
        this.a = g8dVar;
        this.b = clipsInterestsComponent;
        this.c = gzsVar;
        this.d = new bpn0(new re0(24));
    }

    @Override // xsna.e8d
    public final void a(Context context, VideoFile videoFile) {
        Activity h;
        if (!(videoFile instanceof ClipVideoFile) || (h = e3m.h(context)) == null) {
            return;
        }
        b(new ClipVideoFileAdapter((ClipVideoFile) videoFile), h);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, xsna.bkd] */
    public final void b(SdkClipVideoFile sdkClipVideoFile, Activity activity) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        b bVar = new b(ref$ObjectRef);
        d dVar = new d(sdkClipVideoFile, activity);
        g8d g8dVar = this.a;
        String str = g8dVar.b;
        UserId I0 = sdkClipVideoFile.I0();
        c cVar = new c(activity, bVar);
        g8d.a aVar = g8dVar.a;
        boolean z = aVar instanceof g8d.a.C2925a;
        boolean z2 = !o25.a().b();
        pih0 pih0Var = g8dVar.d;
        ref$ObjectRef.element = new hkd(new ikd((SdkVideoFile) sdkClipVideoFile, str, true, I0, (dz20) cVar, aVar, z2, pih0Var != null ? pih0Var.l8(sdkClipVideoFile) : null, z), dVar, BuildInfo.t() ? new z13(28) : null, this.c.invoke()).a(activity, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, xsna.k930$a] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, xsna.ene, xsna.kq6] */
    public final void c(SdkClipVideoFile sdkClipVideoFile, Activity activity) {
        ClipFeedTab clipFeedTab;
        g8d g8dVar = this.a;
        g8d.a aVar = g8dVar.a;
        pih0 pih0Var = g8dVar.d;
        g8d.a.C2925a c2925a = aVar instanceof g8d.a.C2925a ? (g8d.a.C2925a) aVar : null;
        if (c2925a == null || (clipFeedTab = c2925a.a) == null) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        e eVar = new e(ref$ObjectRef);
        f fVar = new f(new nme(clipFeedTab, pih0Var != null ? pih0Var.kd() : null), this, ref$ObjectRef2);
        ref$ObjectRef2.element = new a(activity, clipFeedTab, eVar, sdkClipVideoFile);
        ?? eneVar = new ene(activity, new ikd((SdkVideoFile) sdkClipVideoFile, g8dVar.b, sdkClipVideoFile.I0(), (dz20) ref$ObjectRef2.element, g8dVar.a, !o25.a().b(), pih0Var != null ? pih0Var.l8(sdkClipVideoFile) : null, false, 256), fVar);
        eneVar.c();
        ref$ObjectRef.element = eneVar;
    }

    /* compiled from: MoreMenuHelper.kt */
    public static final class f implements nkd {
        public final /* synthetic */ nme a;
        public final /* synthetic */ k930 b;
        public final /* synthetic */ Ref$ObjectRef<a> c;

        /* compiled from: MoreMenuHelper.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipsBottomSheetSideEffectOptions.values().length];
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.DO_NOT_SHOW_SIMILAR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.HIDE_THIS_AUTHOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.CONFIGURE_INTERESTS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClipsBottomSheetSideEffectOptions.CANCEL.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public f(nme nmeVar, k930 k930Var, Ref$ObjectRef<a> ref$ObjectRef) {
            this.a = nmeVar;
            this.b = k930Var;
            this.c = ref$ObjectRef;
        }

        @Override // xsna.nkd
        public final void a(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, SdkVideoFile sdkVideoFile) {
            a aVar;
            g8d g8dVar = this.b.a;
            nme nmeVar = this.a;
            ClipFeedTab clipFeedTab = nmeVar.a;
            int i = a.$EnumSwitchMapping$0[clipsBottomSheetSideEffectOptions.ordinal()];
            Ref$ObjectRef<a> ref$ObjectRef = this.c;
            if (i == 1) {
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.SIMILAR_CLIPS, SchemeStat$TypeClipViewerItem.EventType.HIDE, fzc.b(clipFeedTab), sdkVideoFile);
                nmeVar.b(sdkVideoFile);
                g8dVar.c.b(new f930(sdkVideoFile, new com.vk.movika.sdk.base.flow.binding.l(11, nmeVar, sdkVideoFile)));
                a aVar2 = ref$ObjectRef.element;
                if (aVar2 != null) {
                    aVar2.f = true;
                    return;
                }
                return;
            }
            if (i == 2) {
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.AUTHOR, SchemeStat$TypeClipViewerItem.EventType.HIDE, fzc.b(clipFeedTab), sdkVideoFile);
                nmeVar.b(sdkVideoFile);
                g8dVar.c.b(new e930(sdkVideoFile));
                a aVar3 = ref$ObjectRef.element;
                if (aVar3 != null) {
                    aVar3.f = true;
                    return;
                }
                return;
            }
            if (i != 3) {
                if (i == 4 && (aVar = ref$ObjectRef.element) != null) {
                    aVar.f = true;
                    return;
                }
                return;
            }
            nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.SET_INTERESTS, SchemeStat$TypeClipViewerItem.EventType.HIDE, fzc.b(clipFeedTab), sdkVideoFile);
            a aVar4 = ref$ObjectRef.element;
            if (aVar4 != null) {
                aVar4.g = true;
            }
            if (aVar4 != null) {
                aVar4.f = true;
            }
        }

        @Override // xsna.nkd
        public final void b(ClipsBottomSheetSideEffectOptions clipsBottomSheetSideEffectOptions, Throwable th) {
        }
    }
}
