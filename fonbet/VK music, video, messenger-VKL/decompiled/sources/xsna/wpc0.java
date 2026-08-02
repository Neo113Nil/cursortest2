package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LoadingState;
import com.vk.newsfeed.posting.impl.domain.model.LocalAlbum;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingHints;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;
import com.vk.newsfeed.posting.impl.presentation.model.ActionButtonHints;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.Onboarding;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;
import com.vk.newsfeed.posting.impl.presentation.model.ui.PrivacyViewState;
import com.vk.newsfeed.posting.mentions.PostingMentionState;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import java.util.Date;
import java.util.List;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public interface wpc0<T extends PostingState> extends fm50<T> {

    /* compiled from: PostingViewState.kt */
    public interface a extends wpc0<PostingState.Editing> {

        /* compiled from: PostingViewState.kt */
        /* renamed from: xsna.wpc0$a$a, reason: collision with other inner class name */
        public static final class C3948a implements a {
            public final yzt0<UserId> A;
            public final yzt0<PostEditingReason> B;
            public final yzt0<d020> C;
            public final yzt0<Boolean> D;
            public final yzt0<Date> E;
            public final yzt0<Boolean> F;
            public final yzt0<String> G;
            public final yzt0<Boolean> H;
            public final yzt0<String> I;
            public final yzt0<Boolean> J;
            public final yzt0<Boolean> K;
            public final yzt0<String> L;
            public final yzt0<String> M;
            public final yzt0<Boolean> N;
            public final yzt0<ActionButtonHints> O;
            public final yzt0<PostingHints> P;
            public final yzt0<Boolean> Q;
            public final yzt0<Boolean> R;
            public final yzt0<Onboarding> S;
            public final yzt0<Boolean> T;
            public final yzt0<Boolean> U;
            public final yzt0<PrivacyViewState> V;
            public final yzt0<dpc0> a;
            public final yzt0<tdc0> b;
            public final yzt0<jv5> c;
            public final yzt0<wow<PostingAttachment>> d;
            public final yzt0<vdc0> e;
            public final yzt0<PhotoVideoAttachmentsCropData> f;
            public final yzt0<PostingArticleDto> g;
            public final yzt0<PostingLinkDto> h;
            public final yzt0<mdc0> i;
            public final yzt0<PostingPlaceDto> j;
            public final yzt0<PostingPollDto> k;
            public final yzt0<ma40> l;
            public final yzt0<FileDto> m;
            public final yzt0<String> n;
            public final yzt0<osd0> o;
            public final yzt0<wow<qqa0>> p;
            public final yzt0<PrivacyPostType> q;
            public final yzt0<PostingSettings> r;
            public final yzt0<Boolean> s;
            public final yzt0<Date> t;
            public final yzt0<wow<qyf>> u;
            public final yzt0<Boolean> v;
            public final yzt0<Boolean> w;
            public final yzt0<ActionsAvailabilityState> x;
            public final yzt0<ActionButton> y;
            public final yzt0<List<ActionButton>> z;

            public C3948a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16, h0u0 h0u0Var17, h0u0 h0u0Var18, h0u0 h0u0Var19, h0u0 h0u0Var20, h0u0 h0u0Var21, h0u0 h0u0Var22, h0u0 h0u0Var23, h0u0 h0u0Var24, h0u0 h0u0Var25, h0u0 h0u0Var26, h0u0 h0u0Var27, h0u0 h0u0Var28, h0u0 h0u0Var29, h0u0 h0u0Var30, h0u0 h0u0Var31, h0u0 h0u0Var32, h0u0 h0u0Var33, h0u0 h0u0Var34, h0u0 h0u0Var35, h0u0 h0u0Var36, h0u0 h0u0Var37, h0u0 h0u0Var38, h0u0 h0u0Var39, h0u0 h0u0Var40, h0u0 h0u0Var41, h0u0 h0u0Var42, h0u0 h0u0Var43, h0u0 h0u0Var44, h0u0 h0u0Var45, h0u0 h0u0Var46, h0u0 h0u0Var47, h0u0 h0u0Var48) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
                this.j = h0u0Var10;
                this.k = h0u0Var11;
                this.l = h0u0Var12;
                this.m = h0u0Var13;
                this.n = h0u0Var14;
                this.o = h0u0Var15;
                this.p = h0u0Var16;
                this.q = h0u0Var17;
                this.r = h0u0Var18;
                this.s = h0u0Var19;
                this.t = h0u0Var20;
                this.u = h0u0Var21;
                this.v = h0u0Var22;
                this.w = h0u0Var23;
                this.x = h0u0Var24;
                this.y = h0u0Var25;
                this.z = h0u0Var26;
                this.A = h0u0Var27;
                this.B = h0u0Var28;
                this.C = h0u0Var29;
                this.D = h0u0Var30;
                this.E = h0u0Var31;
                this.F = h0u0Var32;
                this.G = h0u0Var33;
                this.H = h0u0Var34;
                this.I = h0u0Var35;
                this.J = h0u0Var36;
                this.K = h0u0Var37;
                this.L = h0u0Var38;
                this.M = h0u0Var39;
                this.N = h0u0Var40;
                this.O = h0u0Var41;
                this.P = h0u0Var42;
                this.Q = h0u0Var43;
                this.R = h0u0Var44;
                this.S = h0u0Var45;
                this.T = h0u0Var46;
                this.U = h0u0Var47;
                this.V = h0u0Var48;
            }

            @Override // xsna.wpc0.a
            public final yzt0<dpc0> a() {
                return this.a;
            }

            @Override // xsna.wpc0.a
            public final yzt0<tdc0> b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3948a)) {
                    return false;
                }
                C3948a c3948a = (C3948a) obj;
                return epx.f(this.a, c3948a.a) && epx.f(this.b, c3948a.b) && epx.f(this.c, c3948a.c) && epx.f(this.d, c3948a.d) && epx.f(this.e, c3948a.e) && epx.f(this.f, c3948a.f) && epx.f(this.g, c3948a.g) && epx.f(this.h, c3948a.h) && epx.f(this.i, c3948a.i) && epx.f(this.j, c3948a.j) && epx.f(this.k, c3948a.k) && epx.f(this.l, c3948a.l) && epx.f(this.m, c3948a.m) && epx.f(this.n, c3948a.n) && epx.f(this.o, c3948a.o) && epx.f(this.p, c3948a.p) && epx.f(this.q, c3948a.q) && epx.f(this.r, c3948a.r) && epx.f(this.s, c3948a.s) && epx.f(this.t, c3948a.t) && epx.f(this.u, c3948a.u) && epx.f(this.v, c3948a.v) && epx.f(this.w, c3948a.w) && epx.f(this.x, c3948a.x) && epx.f(this.y, c3948a.y) && epx.f(this.z, c3948a.z) && epx.f(this.A, c3948a.A) && epx.f(this.B, c3948a.B) && epx.f(this.C, c3948a.C) && epx.f(this.D, c3948a.D) && epx.f(this.E, c3948a.E) && epx.f(this.F, c3948a.F) && epx.f(this.G, c3948a.G) && epx.f(this.H, c3948a.H) && epx.f(this.I, c3948a.I) && epx.f(this.J, c3948a.J) && epx.f(this.K, c3948a.K) && epx.f(this.L, c3948a.L) && epx.f(this.M, c3948a.M) && epx.f(this.N, c3948a.N) && epx.f(this.O, c3948a.O) && epx.f(this.P, c3948a.P) && epx.f(this.Q, c3948a.Q) && epx.f(this.R, c3948a.R) && epx.f(this.S, c3948a.S) && epx.f(this.T, c3948a.T) && epx.f(this.U, c3948a.U) && epx.f(this.V, c3948a.V);
            }

            public final int hashCode() {
                return this.V.hashCode() + sr.a(this.U, sr.a(this.T, sr.a(this.S, sr.a(this.R, sr.a(this.Q, sr.a(this.P, sr.a(this.O, sr.a(this.N, sr.a(this.M, sr.a(this.L, sr.a(this.K, sr.a(this.J, sr.a(this.I, sr.a(this.H, sr.a(this.G, sr.a(this.F, sr.a(this.E, sr.a(this.D, sr.a(this.C, sr.a(this.B, sr.a(this.A, sr.a(this.z, sr.a(this.y, sr.a(this.x, sr.a(this.w, sr.a(this.v, sr.a(this.u, sr.a(this.t, sr.a(this.s, sr.a(this.r, sr.a(this.q, sr.a(this.p, sr.a(this.o, sr.a(this.n, sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AttachmentPickers(toolbarViewState=");
                sb.append(this.a);
                sb.append(", createPostButtonViewState=");
                sb.append(this.b);
                sb.append(", backStack=");
                sb.append(this.c);
                sb.append(", attachments=");
                sb.append(this.d);
                sb.append(", crops=");
                sb.append(this.e);
                sb.append(", cropData=");
                sb.append(this.f);
                sb.append(", article=");
                sb.append(this.g);
                sb.append(", link=");
                sb.append(this.h);
                sb.append(", carouselSwitcherState=");
                sb.append(this.i);
                sb.append(", place=");
                sb.append(this.j);
                sb.append(", poll=");
                sb.append(this.k);
                sb.append(", music=");
                sb.append(this.l);
                sb.append(", file=");
                sb.append(this.m);
                sb.append(", text=");
                sb.append(this.n);
                sb.append(", products=");
                sb.append(this.o);
                sb.append(", suggestedPlaces=");
                sb.append(this.p);
                sb.append(", postPrivacyType=");
                sb.append(this.q);
                sb.append(", settings=");
                sb.append(this.r);
                sb.append(", postponePublishDateVisible=");
                sb.append(this.s);
                sb.append(", postponePublishDate=");
                sb.append(this.t);
                sb.append(", coauthors=");
                sb.append(this.u);
                sb.append(", canOpenCoauthorsPicker=");
                sb.append(this.v);
                sb.append(", isPrivacyVisible=");
                sb.append(this.w);
                sb.append(", actionsAvailability=");
                sb.append(this.x);
                sb.append(", actionButton=");
                sb.append(this.y);
                sb.append(", availableActionButtons=");
                sb.append(this.z);
                sb.append(", wallOwner=");
                sb.append(this.A);
                sb.append(", editingReason=");
                sb.append(this.B);
                sb.append(", mediaToMarketMapping=");
                sb.append(this.C);
                sb.append(", isNetworkAvailable=");
                sb.append(this.D);
                sb.append(", openForAllDate=");
                sb.append(this.E);
                sb.append(", isOpenForAllChangeAvailable=");
                sb.append(this.F);
                sb.append(", donutTeaserText=");
                sb.append(this.G);
                sb.append(", isCustomDonutTeaserTextAvailable=");
                sb.append(this.H);
                sb.append(", coauthorsOnboardingHint=");
                sb.append(this.I);
                sb.append(", shouldShowAuthorSignSwitch=");
                sb.append(this.J);
                sb.append(", isAuthorSignSwitchedOn=");
                sb.append(this.K);
                sb.append(", signerFirstNameGen=");
                sb.append(this.L);
                sb.append(", signerLastNameGen=");
                sb.append(this.M);
                sb.append(", isCoauthorsAvailable=");
                sb.append(this.N);
                sb.append(", actionButtonHints=");
                sb.append(this.O);
                sb.append(", attachmentPickersHints=");
                sb.append(this.P);
                sb.append(", isStoryRepostSwitchAvailable=");
                sb.append(this.Q);
                sb.append(", isStoryRepostSwitchEnabled=");
                sb.append(this.R);
                sb.append(", isStoryRepostSwitchOnboardingVisible=");
                sb.append(this.S);
                sb.append(", isStoryRepostSwitchedOn=");
                sb.append(this.T);
                sb.append(", isNeedUpMarketButtons=");
                sb.append(this.U);
                sb.append(", privacy=");
                return tr.c(sb, this.V, ')');
            }
        }

        /* compiled from: PostingViewState.kt */
        public static final class b implements a {
            public final yzt0<Boolean> A;
            public final yzt0<dpc0> a;
            public final yzt0<tdc0> b;
            public final yzt0<jv5> c;
            public final yzt0<UserId> d;
            public final yzt0<UserId> e;
            public final yzt0<String> f;
            public final yzt0<PostingTextRestriction> g;
            public final yzt0<Integer> h;
            public final yzt0<wow<LocalAlbum>> i;
            public final yzt0<LocalAlbum> j;
            public final yzt0<gvz> k;
            public final yzt0<wow<zai0>> l;
            public final yzt0<chc0> m;
            public final yzt0<Integer> n;
            public final yzt0<Integer> o;
            public final yzt0<wow<PostingAttachment>> p;
            public final yzt0<vdc0> q;
            public final yzt0<PostingArticleDto> r;
            public final yzt0<PostingLinkDto> s;
            public final yzt0<mdc0> t;
            public final yzt0<kv9> u;
            public final yzt0<PostingMentionState> v;
            public final yzt0<ActionsAvailabilityState> w;
            public final yzt0<PostEditingReason> x;
            public final yzt0<d020> y;
            public final yzt0<Boolean> z;

            public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14, h0u0 h0u0Var15, h0u0 h0u0Var16, h0u0 h0u0Var17, h0u0 h0u0Var18, h0u0 h0u0Var19, h0u0 h0u0Var20, h0u0 h0u0Var21, h0u0 h0u0Var22, h0u0 h0u0Var23, h0u0 h0u0Var24, h0u0 h0u0Var25, h0u0 h0u0Var26, h0u0 h0u0Var27) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
                this.j = h0u0Var10;
                this.k = h0u0Var11;
                this.l = h0u0Var12;
                this.m = h0u0Var13;
                this.n = h0u0Var14;
                this.o = h0u0Var15;
                this.p = h0u0Var16;
                this.q = h0u0Var17;
                this.r = h0u0Var18;
                this.s = h0u0Var19;
                this.t = h0u0Var20;
                this.u = h0u0Var21;
                this.v = h0u0Var22;
                this.w = h0u0Var23;
                this.x = h0u0Var24;
                this.y = h0u0Var25;
                this.z = h0u0Var26;
                this.A = h0u0Var27;
            }

            @Override // xsna.wpc0.a
            public final yzt0<dpc0> a() {
                return this.a;
            }

            @Override // xsna.wpc0.a
            public final yzt0<tdc0> b() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k) && epx.f(this.l, bVar.l) && epx.f(this.m, bVar.m) && epx.f(this.n, bVar.n) && epx.f(this.o, bVar.o) && epx.f(this.p, bVar.p) && epx.f(this.q, bVar.q) && epx.f(this.r, bVar.r) && epx.f(this.s, bVar.s) && epx.f(this.t, bVar.t) && epx.f(this.u, bVar.u) && epx.f(this.v, bVar.v) && epx.f(this.w, bVar.w) && epx.f(this.x, bVar.x) && epx.f(this.y, bVar.y) && epx.f(this.z, bVar.z) && epx.f(this.A, bVar.A);
            }

            public final int hashCode() {
                return this.A.hashCode() + sr.a(this.z, sr.a(this.y, sr.a(this.x, sr.a(this.w, sr.a(this.v, sr.a(this.u, sr.a(this.t, sr.a(this.s, sr.a(this.r, sr.a(this.q, sr.a(this.p, sr.a(this.o, sr.a(this.n, sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PostTextInput(toolbarViewState=");
                sb.append(this.a);
                sb.append(", createPostButtonViewState=");
                sb.append(this.b);
                sb.append(", backStack=");
                sb.append(this.c);
                sb.append(", publisherId=");
                sb.append(this.d);
                sb.append(", pickerMediaOwnerId=");
                sb.append(this.e);
                sb.append(", text=");
                sb.append(this.f);
                sb.append(", textRestriction=");
                sb.append(this.g);
                sb.append(", textMaxLength=");
                sb.append(this.h);
                sb.append(", localAlbums=");
                sb.append(this.i);
                sb.append(", selectedLocalAlbum=");
                sb.append(this.j);
                sb.append(", localMedia=");
                sb.append(this.k);
                sb.append(", selectedMedia=");
                sb.append(this.l);
                sb.append(", mediaPickerToolbarViewState=");
                sb.append(this.m);
                sb.append(", mediaPickerSheetNextState=");
                sb.append(this.n);
                sb.append(", mediaPickerSheetCurrentState=");
                sb.append(this.o);
                sb.append(", attachments=");
                sb.append(this.p);
                sb.append(", crops=");
                sb.append(this.q);
                sb.append(", article=");
                sb.append(this.r);
                sb.append(", link=");
                sb.append(this.s);
                sb.append(", carouselSwitcherState=");
                sb.append(this.t);
                sb.append(", carouselRatio=");
                sb.append(this.u);
                sb.append(", postingMentionState=");
                sb.append(this.v);
                sb.append(", actionsAvailability=");
                sb.append(this.w);
                sb.append(", editingReason=");
                sb.append(this.x);
                sb.append(", mediaToMarketMapping=");
                sb.append(this.y);
                sb.append(", isNetworkAvailable=");
                sb.append(this.z);
                sb.append(", isDraftsButtonVisible=");
                return tr.c(sb, this.A, ')');
            }
        }

        yzt0<dpc0> a();

        yzt0<tdc0> b();
    }

    /* compiled from: PostingViewState.kt */
    public static final class b implements wpc0<PostingState.Editing> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 102892135;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class c implements wpc0<PostingState.Loading> {
        public final yzt0<LoadingState> a;
        public final yzt0<Boolean> b;

        public c() {
            throw null;
        }

        public c(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loading(initialPostingViewData=null, loadingState=");
            sb.append(this.a);
            sb.append(", withLoadingView=");
            return tr.c(sb, this.b, ')');
        }
    }
}
