package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.ActionLinkSnippetIcon;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.external.action.ClipExternalAction;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a7f0;
import xsna.n0x;
import xsna.qzb0;
import xsna.t0d;
import xsna.uu;
import xsna.wk50;
import xsna.z2d;

/* compiled from: BindingActionApplier.kt */
/* loaded from: classes17.dex */
public final class c47 implements oj50<z2d, ClipItemAction, ClipItemPatch> {
    public static final /* synthetic */ qcy<Object>[] p;
    public final wj50<t0d> a;
    public final m0x b;
    public final s16 c;
    public final su d;
    public final ojh0 e;
    public final sfq f;
    public final n0d g;
    public final y1e h;
    public final gzs<Boolean> i;
    public final izs<String, Boolean> j;
    public final izs<String, Boolean> k;
    public final boolean l;
    public final boolean m;
    public final yas0 n;
    public final d80 o = new d80();

    /* compiled from: BindingActionApplier.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionLinkSnippetIcon.values().length];
            try {
                iArr[ActionLinkSnippetIcon.LIVE_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionLinkSnippetIcon.LIVE_UPCOMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionLinkSnippetIcon.LIVE_FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(c47.class, "loadActionButtonIconDisposable", "getLoadActionButtonIconDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        p = new qcy[]{mutablePropertyReference1Impl};
    }

    public c47(f4z f4zVar, m0x m0xVar, s16 s16Var, su suVar, ojh0 ojh0Var, zn50 zn50Var, n0d n0dVar, y1e y1eVar, gzs gzsVar, izs izsVar, izs izsVar2, boolean z, boolean z2, yas0 yas0Var) {
        this.a = f4zVar;
        this.b = m0xVar;
        this.c = s16Var;
        this.d = suVar;
        this.e = ojh0Var;
        this.f = zn50Var;
        this.g = n0dVar;
        this.h = y1eVar;
        this.i = gzsVar;
        this.j = izsVar;
        this.k = izsVar2;
        this.l = z;
        this.m = z2;
        this.n = yas0Var;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        io.reactivex.rxjava3.disposables.c fVar;
        io.reactivex.rxjava3.disposables.b bVar = aVar.b;
        z2d z2dVar = (z2d) km50Var;
        ClipItemAction clipItemAction = (ClipItemAction) kj50Var;
        if (clipItemAction instanceof ClipItemAction.f) {
            ClipItemAction.f fVar2 = (ClipItemAction.f) clipItemAction;
            int i = 0;
            if (!(fVar2 instanceof ClipItemAction.f.a)) {
                if (!(fVar2 instanceof ClipItemAction.f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.a(ClipItemAction.h.a.b);
                aVar.a(ClipItemAction.Nps.a.b);
                bVar.e();
                aVar.b(ClipItemPatch.b.C0661b.b);
                return;
            }
            ClipItemAction.f.a aVar2 = (ClipItemAction.f.a) clipItemAction;
            FeedItem.f fVar3 = aVar2.c;
            if (z2dVar instanceof z2d.b) {
                c(aVar, aVar2, null);
                return;
            }
            if (!(z2dVar instanceof z2d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            z2d.a aVar3 = (z2d.a) z2dVar;
            String str = aVar3.b.b;
            SdkClipVideoFile sdkClipVideoFile = fVar3.e;
            n0d n0dVar = this.g;
            n0dVar.getClass();
            if (!epx.f(str, sdkClipVideoFile.r1())) {
                c(aVar, aVar2, aVar3);
                return;
            }
            m0d a2 = n0dVar.a(aVar2.b, fVar3);
            aVar.b(new ClipItemPatch.b.a.C0660b(a2));
            this.a.b(new t0d.c(a2.b()));
            SdkClipVideoFile sdkClipVideoFile2 = a2.a;
            if (sdkClipVideoFile2.t0() && sdkClipVideoFile2.Q() == null) {
                UserId a3 = fkq0.a(sdkClipVideoFile2.I0());
                String a1 = sdkClipVideoFile2.a1();
                e1 e1Var = new e1(aVar, 11);
                yas0 yas0Var = this.n;
                if (yas0Var.a) {
                    ((abs0) yas0Var.b.getValue()).getClass();
                    tfx tfxVar = new tfx("videoChannels.getViewSettings", new iun0(6), new fyp0(2));
                    tfx.n(tfxVar, "channel_id", a3, 1L, 0L, 8);
                    fVar = rsg0.y0(yfb.x(tfxVar), null, null, 3).subscribe(new n3t(new zas0(i, a1, e1Var), 29), new ux00(new p6e0(15), 28));
                } else {
                    fVar = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
                }
                bVar.b(fVar);
            }
        }
    }

    public final boolean b(m0d m0dVar) {
        SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
        if (!this.m) {
            return false;
        }
        if (sdkClipVideoFile.d3() == null || !(!r0.b.isEmpty())) {
            SdkClipsAdsFeaturesParams d3 = sdkClipVideoFile.d3();
            if ((d3 != null ? d3.d : null) == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        if ((!r2.c.contains(com.vk.clips.sdk.models.ads.SdkAdsFlags.HIDE_FULLSCREEN_AD_BANNER)) == true) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0131, code lost:
    
        if (b(r6) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0133, code lost:
    
        r27 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(wk50.a aVar, ClipItemAction.f.a aVar2, z2d.a aVar3) {
        uu uuVar;
        String str;
        ojh0 ojh0Var;
        uu uuVar2;
        ClipExternalAction clipExternalAction;
        boolean z;
        boolean z2;
        qzb0.a aVar4;
        ojh0 ojh0Var2;
        boolean z3;
        n0x n0xVar;
        ojh0 ojh0Var3;
        int i;
        int i2;
        int i3;
        ojh0 ojh0Var4;
        ActionLinkSnippetIcon actionLinkSnippetIcon;
        SdkClipVideoFile sdkClipVideoFile = aVar2.b;
        j4b0 j4b0Var = aVar2.e;
        FeedItem.f fVar = aVar2.c;
        m0d a2 = this.g.a(sdkClipVideoFile, fVar);
        String str2 = a2.b;
        SdkClipVideoFile sdkClipVideoFile2 = a2.a;
        SdkActionLink m1 = sdkClipVideoFile2.m1();
        ActionLinkSnippet actionLinkSnippet = m1 != null ? m1.g : null;
        if (actionLinkSnippet != null && (actionLinkSnippetIcon = actionLinkSnippet.l) != null) {
            int i4 = a.$EnumSwitchMapping$0[actionLinkSnippetIcon.ordinal()];
            if (i4 == 1) {
                uuVar = new uu.b(R.drawable.vk_icon_live_outline_20, Integer.valueOf(R.attr.vk_ui_icon_negative));
            } else if (i4 == 2) {
                uuVar = new uu.b(R.drawable.vk_icon_live_outline_20, null);
            } else if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (actionLinkSnippet != null || (str = actionLinkSnippet.h.a(300)) == null || uuVar != null) {
                str = null;
            }
            ojh0Var = this.e;
            if (uuVar == null) {
                Bitmap b = ojh0Var.b(str);
                uuVar = b != null ? new uu.a(b) : null;
            }
            uuVar2 = uuVar;
            clipExternalAction = this.h.get(str2);
            if (clipExternalAction != ClipExternalAction.ShowActionButton.INACTIVE) {
                z = true;
                z2 = false;
            } else {
                z = clipExternalAction == ClipExternalAction.ShowActionButton.ACTIVE;
                z2 = z;
            }
            qzb0 qzb0Var = aVar2.g;
            aVar4 = qzb0Var.a;
            String str3 = str;
            if ((!aVar4.a || z) && !aVar4.b) {
                ojh0Var2 = ojh0Var;
                z3 = true;
            } else {
                ojh0Var2 = ojh0Var;
                z3 = false;
            }
            boolean z4 = j4b0Var.e;
            n0xVar = this.b.b.get(str2);
            if (n0xVar == null) {
                n0xVar = n0x.a.a;
            }
            n0x n0xVar2 = n0xVar;
            nlh0 nlh0Var = fVar.g;
            ojh0Var3 = ojh0Var2;
            kih0 kih0Var = fVar.h;
            y0r y0rVar = fVar.f;
            int i5 = aVar2.d;
            sfq sfqVar = this.f;
            boolean c = sfqVar.c();
            ixp0 ixp0Var = aVar2.f;
            OwnerRightState b2 = sfqVar.b(sdkClipVideoFile2);
            String str4 = a2.b;
            if (!this.i.invoke().booleanValue() || !this.k.invoke(str2).booleanValue()) {
                i = 1;
            } else if (this.l && this.j.invoke(str2).booleanValue() && (r2 = sdkClipVideoFile2.d3()) != null) {
                i = 1;
            } else {
                i = 1;
            }
            boolean z5 = 0;
            SdkClipsAdsFeaturesParams d3 = sdkClipVideoFile2.d3();
            List<String> list = !b(a2) ? d3 == null ? d3.b : null : null;
            SdkClipsAdsFeaturesParams d32 = sdkClipVideoFile2.d3();
            t16 b3 = this.c.b(str4, z5, list, !b(a2) ? d32 == null ? d32.d : null : null, n0xVar2);
            io.reactivex.rxjava3.disposables.c cVar = null;
            i2 = i;
            aVar.b(new ClipItemPatch.b.a.C0659a(a2, nlh0Var, kih0Var, y0rVar, i5, c, j4b0Var, z3, z2, uuVar2, z4, ixp0Var, b2, n0xVar2, qzb0Var, b3, fVar.j, aVar3 == null ? aVar3.x : false));
            ClipItemAction[] clipItemActionArr = new ClipItemAction[i2];
            clipItemActionArr[0] = ClipItemAction.h.a.b;
            aVar.a(clipItemActionArr);
            ClipItemAction[] clipItemActionArr2 = new ClipItemAction[i2];
            clipItemActionArr2[0] = ClipItemAction.Nps.a.b;
            aVar.a(clipItemActionArr2);
            aVar.b.e();
            if (uuVar2 == null || str3 == null) {
                i3 = i2;
                ojh0Var4 = ojh0Var3;
            } else {
                i3 = i2;
                ojh0Var4 = ojh0Var3;
                cVar = a7f0.a.e(aVar, ojh0Var3.c(Uri.parse(str3)), null, new l5(aVar, 9), new ix2(this, 7), null, 9);
            }
            qcy<Object> qcyVar = p[0];
            this.o.g(cVar);
            if (dgd.e(sdkClipVideoFile2)) {
                ru.a(aVar, a2.g, ojh0Var4, this.d, new bt3(aVar, i3));
            }
            ClipItemAction[] clipItemActionArr3 = new ClipItemAction[i3];
            clipItemActionArr3[0] = ClipItemAction.Nps.d.b;
            aVar.a(clipItemActionArr3);
            ClipItemAction[] clipItemActionArr4 = new ClipItemAction[i3];
            clipItemActionArr4[0] = ClipItemAction.j0.b;
            aVar.a(clipItemActionArr4);
            ClipItemAction[] clipItemActionArr5 = new ClipItemAction[i3];
            clipItemActionArr5[0] = ClipItemAction.c0.b.b;
            aVar.a(clipItemActionArr5);
            ClipItemAction[] clipItemActionArr6 = new ClipItemAction[i3];
            clipItemActionArr6[0] = ClipItemAction.e.C0654e.b;
            aVar.a(clipItemActionArr6);
            this.a.b(new t0d.c(a2.b()));
        }
        uuVar = null;
        if (actionLinkSnippet != null) {
        }
        str = null;
        ojh0Var = this.e;
        if (uuVar == null) {
        }
        uuVar2 = uuVar;
        clipExternalAction = this.h.get(str2);
        if (clipExternalAction != ClipExternalAction.ShowActionButton.INACTIVE) {
        }
        qzb0 qzb0Var2 = aVar2.g;
        aVar4 = qzb0Var2.a;
        String str32 = str;
        if (aVar4.a) {
        }
        ojh0Var2 = ojh0Var;
        z3 = true;
        boolean z42 = j4b0Var.e;
        n0xVar = this.b.b.get(str2);
        if (n0xVar == null) {
        }
        n0x n0xVar22 = n0xVar;
        nlh0 nlh0Var2 = fVar.g;
        ojh0Var3 = ojh0Var2;
        kih0 kih0Var2 = fVar.h;
        y0r y0rVar2 = fVar.f;
        int i52 = aVar2.d;
        sfq sfqVar2 = this.f;
        boolean c2 = sfqVar2.c();
        ixp0 ixp0Var2 = aVar2.f;
        OwnerRightState b22 = sfqVar2.b(sdkClipVideoFile2);
        String str42 = a2.b;
        if (!this.i.invoke().booleanValue()) {
        }
        i = 1;
        boolean z52 = 0;
        SdkClipsAdsFeaturesParams d33 = sdkClipVideoFile2.d3();
        if (!b(a2)) {
        }
        SdkClipsAdsFeaturesParams d322 = sdkClipVideoFile2.d3();
        t16 b32 = this.c.b(str42, z52, list, !b(a2) ? d322 == null ? d322.d : null : null, n0xVar22);
        io.reactivex.rxjava3.disposables.c cVar2 = null;
        i2 = i;
        aVar.b(new ClipItemPatch.b.a.C0659a(a2, nlh0Var2, kih0Var2, y0rVar2, i52, c2, j4b0Var, z3, z2, uuVar2, z42, ixp0Var2, b22, n0xVar22, qzb0Var2, b32, fVar.j, aVar3 == null ? aVar3.x : false));
        ClipItemAction[] clipItemActionArr7 = new ClipItemAction[i2];
        clipItemActionArr7[0] = ClipItemAction.h.a.b;
        aVar.a(clipItemActionArr7);
        ClipItemAction[] clipItemActionArr22 = new ClipItemAction[i2];
        clipItemActionArr22[0] = ClipItemAction.Nps.a.b;
        aVar.a(clipItemActionArr22);
        aVar.b.e();
        if (uuVar2 == null) {
        }
        i3 = i2;
        ojh0Var4 = ojh0Var3;
        qcy<Object> qcyVar2 = p[0];
        this.o.g(cVar2);
        if (dgd.e(sdkClipVideoFile2)) {
        }
        ClipItemAction[] clipItemActionArr32 = new ClipItemAction[i3];
        clipItemActionArr32[0] = ClipItemAction.Nps.d.b;
        aVar.a(clipItemActionArr32);
        ClipItemAction[] clipItemActionArr42 = new ClipItemAction[i3];
        clipItemActionArr42[0] = ClipItemAction.j0.b;
        aVar.a(clipItemActionArr42);
        ClipItemAction[] clipItemActionArr52 = new ClipItemAction[i3];
        clipItemActionArr52[0] = ClipItemAction.c0.b.b;
        aVar.a(clipItemActionArr52);
        ClipItemAction[] clipItemActionArr62 = new ClipItemAction[i3];
        clipItemActionArr62[0] = ClipItemAction.e.C0654e.b;
        aVar.a(clipItemActionArr62);
        this.a.b(new t0d.c(a2.b()));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
