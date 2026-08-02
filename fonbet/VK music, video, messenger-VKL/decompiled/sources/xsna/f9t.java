package xsna;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.android.gms.internal.measurement.zznn;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.dto.badges.BadgePostItem;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.badges.BadgesSet;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.voip.dto.call_member.CallMemberId;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.cri;

/* compiled from: GamesBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class f9t implements yxe, bzl, kl8, q701, t36 {
    public static final yaq0 j;
    public static final /* synthetic */ f9t k;
    public final /* synthetic */ int b;
    public static final f9t c = new f9t(3);
    public static final jai d = new jai(1567250672, new ug4(0, 5), false);
    public static final f9t e = new f9t(5);
    public static final f9t f = new f9t(6);
    public static final f9t g = new f9t(8);
    public static final kl60 h = new kl60(27);
    public static final wyn0 i = new wyn0(8);
    public static final /* synthetic */ f9t l = new f9t(11);

    static {
        int i2 = 10;
        j = new yaq0(i2);
        k = new f9t(i2);
    }

    public /* synthetic */ f9t(int i2) {
        this.b = i2;
    }

    public static final q630 A(q630 q630Var) {
        return q630Var.g(new mqn0(a5x.a, i));
    }

    public static ngg0 B(mgg0 mgg0Var, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1030428302, 24960, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlock.Bottom.Companion.invoke (ReviewBlock.kt:86)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(642938074, 3078, -1, "com.vk.ecomm.design.compose.reviewcell.remember (ReviewBlockBottomImpl.kt:78)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new ngg0(mgg0Var, gzsVar, gzsVar2);
            aVar.R(x);
        }
        ngg0 ngg0Var = (ngg0) x;
        ((zak0) ngg0Var.a).setValue(mgg0Var);
        ((zak0) ngg0Var.b).setValue(gzsVar);
        ((zak0) ngg0Var.c).setValue(gzsVar2);
        ((zak0) ngg0Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return ngg0Var;
    }

    public static final boolean C(ConversationParticipant conversationParticipant) {
        Long n;
        ParticipantId externalId = conversationParticipant.getExternalId();
        if (externalId == null || (n = arm0.n(externalId.id)) == null) {
            return false;
        }
        return n.longValue() < 0 || externalId.isAnon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean D(boolean z, Badgeable badgeable, s1c0 s1c0Var) {
        if (z || (s1c0Var.i && badgeable != 0 && badgeable.u0() != null && badgeable.ca() != null)) {
            NewsEntry newsEntry = badgeable instanceof NewsEntry ? (NewsEntry) badgeable : null;
            if (newsEntry == null || !di60.B(newsEntry)) {
                return true;
            }
        }
        return false;
    }

    public static String E() {
        return J() + "/masks_urho3d";
    }

    public static final vfe F(vfe vfeVar, izs izsVar) {
        return new vfe(new defpackage.m(26, vfeVar, izsVar));
    }

    public static final q630 G(q630 q630Var) {
        return q630Var.g(new mqn0(a5x.a, j));
    }

    public static Bundle H(z5k0 z5k0Var) {
        Bundle bundle = new Bundle(z5k0Var.f + 9);
        bundle.putString("phoneMask", z5k0Var.a);
        bundle.putString("validationSid", z5k0Var.b);
        bundle.putParcelable("presenterInfo", z5k0Var.c);
        bundle.putParcelable("verificationMethod", z5k0Var.e);
        bundle.putBoolean("requestAccessFactor", z5k0Var.g);
        bundle.putString("login", z5k0Var.d);
        bundle.putBoolean("key_is_ok_mimicry", z5k0Var.i);
        z5k0Var.h.getClass();
        s3q0 s3q0Var = s3q0.a;
        return bundle;
    }

    public static aiy I(maj0 maj0Var) throws GeneralSecurityException, IOException {
        com.google.crypto.tink.proto.a x = com.google.crypto.tink.proto.a.x(maj0Var.a(), com.google.crypto.tink.shaded.protobuf.k.a());
        if (x.t() > 0) {
            return new aiy(x);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static String J() {
        return i5s.a(new StringBuilder(), io9.c.a.get().getApplicationInfo().dataDir, "/files");
    }

    public static final String K(long j2) {
        return brm0.y(String.valueOf(j2), "200000", "2x");
    }

    public static final q630 L() {
        return new mqn0(a5x.a, h);
    }

    public static final p6s M(Object obj) {
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                if (next instanceof p6s) {
                    obj = next;
                    break;
                }
            }
        }
        if (obj instanceof p6s) {
            return (p6s) obj;
        }
        return null;
    }

    public static z5k0 N(Bundle bundle) {
        String string = bundle != null ? bundle.getString("phoneMask") : null;
        String string2 = bundle != null ? bundle.getString("validationSid") : null;
        CheckPresenterInfo checkPresenterInfo = bundle != null ? (CheckPresenterInfo) bundle.getParcelable("presenterInfo") : null;
        VerificationMethodState verificationMethodState = bundle != null ? (VerificationMethodState) bundle.getParcelable("verificationMethod") : null;
        return new z5k0(string, string2, checkPresenterInfo, bundle != null ? bundle.getString("login") : null, verificationMethodState != null ? verificationMethodState : null, bundle != null ? bundle.getBoolean("requestAccessFactor") : false, bundle != null ? bundle.getBoolean("key_is_ok_mimicry", false) : false, 736);
    }

    public static void O(aiy aiyVar, naj0 naj0Var) throws IOException {
        if (!naj0Var.a.putString(naj0Var.b, g2v.b(aiyVar.a.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    public static final aha0 d() {
        return new aha0();
    }

    public static final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-72882467, i2, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:37)");
        }
        int hashCode = Long.hashCode(n34.n(aVar));
        q630 c2 = qri.c(aVar, q630Var);
        sy90 D = aVar.D();
        cri.h7.getClass();
        LayoutNode.a aVar2 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar2);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, chk0.a, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c2, cri.a.d);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static n34 f() {
        return new n34();
    }

    public static File g() {
        return new File(E());
    }

    public static final void h(Conversation conversation) {
        conversation.init();
        conversation.connect();
    }

    public static File i() {
        return new File(J() + "/base_engine_data/asset");
    }

    public static SpannableStringBuilder j(wh9 wh9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ilv0 ilv0Var = new ilv0(spannableStringBuilder);
        wh9Var.invoke(ilv0Var);
        Iterator it = ilv0Var.a.iterator();
        while (it.hasNext()) {
            hlv0 hlv0Var = (hlv0) it.next();
            spannableStringBuilder.append(hlv0Var.a);
            Iterator it2 = hlv0Var.b.iterator();
            while (it2.hasNext()) {
                jlv0 jlv0Var = (jlv0) it2.next();
                int i2 = jlv0Var.b;
                if (i2 < 0) {
                    jlv0Var.b = 0;
                } else {
                    jlv0Var.b = Math.min(i2, spannableStringBuilder.length());
                }
                int i3 = jlv0Var.c;
                if (i3 < 0) {
                    jlv0Var.c = spannableStringBuilder.length();
                } else {
                    jlv0Var.c = Math.min(i3, spannableStringBuilder.length());
                }
                spannableStringBuilder.setSpan(jlv0Var.a, jlv0Var.b, jlv0Var.c, 33);
            }
        }
        return spannableStringBuilder;
    }

    public static u1c0 k(Carousel carousel) {
        u1c0 u1c0Var = new u1c0(127, carousel);
        u1c0Var.h = (carousel instanceof AppCarousel ? (AppCarousel) carousel : null) != null ? (ol60) j5g.a0(new uq20().a((AppCarousel) carousel)) : null;
        return u1c0Var;
    }

    public static u1c0 l(Carousel carousel) {
        u1c0 u1c0Var = new u1c0(320, carousel);
        u1c0Var.h = (carousel instanceof AppCarousel ? (AppCarousel) carousel : null) != null ? (ol60) j5g.a0(new gdf0().a((AppCarousel) carousel)) : null;
        return u1c0Var;
    }

    public static File m(String str) {
        return new File(E() + DomExceptionUtils.SEPARATOR + str + "/mask.json");
    }

    public static File n(String str) {
        File file = new File(E() + DomExceptionUtils.SEPARATOR + str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static int o(String str) {
        return x(n(str));
    }

    public static File p() {
        return new File(J() + "/base_engine_data");
    }

    public static int q() {
        return x(p());
    }

    public static boolean r(BadgesSet badgesSet) {
        List<BadgePostItem> list;
        return badgesSet != null && (list = badgesSet.e) != null && list.size() == 1 && ((BadgePostItem) j5g.Y(list)).b.b == 38;
    }

    public static Triple s(BadgesSet badgesSet, s1c0 s1c0Var) {
        List<BadgePostItem> list;
        int i2 = 0;
        if (!s1c0Var.i) {
            return new Triple(Boolean.FALSE, 0, 0);
        }
        Boolean valueOf = Boolean.valueOf((badgesSet == null || badgesSet.e.isEmpty() || badgesSet.f <= 0) ? false : true);
        Integer valueOf2 = Integer.valueOf(badgesSet != null ? badgesSet.f : 0);
        if (badgesSet != null && (list = badgesSet.e) != null) {
            i2 = list.size();
        }
        return new Triple(valueOf, valueOf2, Integer.valueOf(i2));
    }

    public static List t(BadgesSet badgesSet, boolean z) {
        List<BadgePostItem> list;
        List H0;
        if (badgesSet == null || (list = badgesSet.e) == null || (H0 = j5g.H0(list, 3)) == null) {
            return EmptyList.b;
        }
        List list2 = H0;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((BadgePostItem) it.next()).b.e.a(cn70.b(16), z));
        }
        return arrayList;
    }

    public static final CallMemberId u(Conversation conversation) {
        ConversationParticipant conversationParticipant;
        ParticipantId externalId;
        Iterator<ConversationParticipant> it = conversation.getParticipants().iterator();
        while (true) {
            if (!it.hasNext()) {
                conversationParticipant = null;
                break;
            }
            conversationParticipant = it.next();
            ConversationParticipant conversationParticipant2 = conversationParticipant;
            if (!epx.f(conversationParticipant2, conversation.getMe()) && conversationParticipant2.isUseable() && conversationParticipant2.isCallAccepted()) {
                break;
            }
        }
        ConversationParticipant conversationParticipant3 = conversationParticipant;
        if (conversationParticipant3 == null || (externalId = conversationParticipant3.getExternalId()) == null) {
            return null;
        }
        return mnh0.E(externalId);
    }

    public static final CallMemberId v(Conversation conversation) {
        ParticipantId externalId;
        CallMemberId u = u(conversation);
        if (u != null) {
            return u;
        }
        ConversationParticipant opponent = conversation.getOpponent();
        if (opponent == null || (externalId = opponent.getExternalId()) == null) {
            return null;
        }
        return mnh0.E(externalId);
    }

    public static final vfe w(mm50 mm50Var) {
        return new vfe(new xa9(1, mm50Var, mm50.class, "events", "events(Lkotlin/jvm/functions/Function1;)Lcom/vk/mvi/Clearable;", 0, 10));
    }

    public static int x(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return -1;
        }
        int i2 = 0;
        for (File file2 : listFiles) {
            i2 = file2.isDirectory() ? x(file2) + i2 : i2 + 1;
        }
        return i2;
    }

    @Nullable
    public static String y(String str) {
        try {
            return new BufferedReader(new FileReader(new File(new File(!TextUtils.isEmpty(str) ? n(str) : null, "string"), "range"))).readLine();
        } catch (IOException unused) {
            return null;
        }
    }

    public static final vfe z(mm50 mm50Var) {
        return new vfe(new whe(1, mm50Var, mm50.class, "states", "states(Lkotlin/jvm/functions/Function1;)Lcom/vk/mvi/Clearable;", 0, 9));
    }

    @Override // xsna.bzl
    public float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // xsna.kl8
    public int b(MsgBubblePart msgBubblePart) {
        return 0;
    }

    @Override // xsna.t36
    public s36 c(Context context, BannerAdUiData bannerAdUiData, boolean z) {
        return new prf0(context);
    }

    public String toString() {
        switch (this.b) {
            case 6:
                return "NoOpBubbleDrawableProvider";
            default:
                return super.toString();
        }
    }

    @Override // xsna.q701
    public Object zza() {
        switch (this.b) {
            case 10:
                List list = s701.a;
                return Long.valueOf(zznn.zzb());
            default:
                List list2 = s701.a;
                return Long.valueOf(zznn.zzs());
        }
    }

    public f9t(lmc lmcVar) {
        this.b = 23;
    }
}
