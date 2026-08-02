package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorState;
import com.vk.newsfeed.posting.poll_editor.presentation.base.fragment.PollEditorModalBottomSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import xsna.q630;
import xsna.xpb0;

/* compiled from: PollEditorModalContentView.kt */
/* loaded from: classes4.dex */
public final class mob0 extends i6v0<wpb0, pnb0> {
    public final xpb0<PollEditorState> f;
    public final wx40 g;

    /* compiled from: PollEditorModalContentView.kt */
    public static final class a implements gzs<bpw<qv2, iv2>> {
        public final /* synthetic */ wh50<bpw<qv2, iv2>> b;

        public a(wh50<bpw<qv2, iv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.gzs
        public final bpw<qv2, iv2> invoke() {
            return new bpw<>(this.b.getValue().b);
        }
    }

    /* compiled from: PollEditorModalContentView.kt */
    public static final class b implements izs<bpw<qv2, iv2>, s3q0> {
        public final /* synthetic */ wh50<bpw<qv2, iv2>> b;

        public b(wh50<bpw<qv2, iv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(bpw<qv2, iv2> bpwVar) {
            this.b.setValue(new bpw<>(bpwVar.b));
            return s3q0.a;
        }
    }

    /* compiled from: PollEditorModalContentView.kt */
    public static final class c implements gzs<wow<qv2>> {
        public final /* synthetic */ wh50<wow<qv2>> b;

        public c(wh50<wow<qv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.gzs
        public final wow<qv2> invoke() {
            return new wow<>(this.b.getValue().b);
        }
    }

    /* compiled from: PollEditorModalContentView.kt */
    public static final class d implements izs<wow<qv2>, s3q0> {
        public final /* synthetic */ wh50<wow<qv2>> b;

        public d(wh50<wow<qv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(wow<qv2> wowVar) {
            this.b.setValue(new wow<>(wowVar.b));
            return s3q0.a;
        }
    }

    /* compiled from: PollEditorModalContentView.kt */
    public static final class e implements gzs<wow<qv2>> {
        public final /* synthetic */ wh50<wow<qv2>> b;

        public e(wh50<wow<qv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.gzs
        public final wow<qv2> invoke() {
            return new wow<>(this.b.getValue().b);
        }
    }

    /* compiled from: PollEditorModalContentView.kt */
    public static final class f implements izs<wow<qv2>, s3q0> {
        public final /* synthetic */ wh50<wow<qv2>> b;

        public f(wh50<wow<qv2>> wh50Var) {
            this.b = wh50Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(wow<qv2> wowVar) {
            this.b.setValue(new wow<>(wowVar.b));
            return s3q0.a;
        }
    }

    public mob0(xpb0 xpb0Var, wx40 wx40Var, PollEditorModalBottomSheet pollEditorModalBottomSheet, Context context) {
        super(context, pollEditorModalBottomSheet);
        this.f = xpb0Var;
        this.g = wx40Var;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((wpb0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(wpb0 wpb0Var, izs<? super pnb0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        xpb0.a aVar3;
        wh50 wh50Var;
        wh50 wh50Var2;
        gzs gzsVar;
        xpb0.a aVar4;
        int i3;
        bpw bpwVar;
        wow wowVar;
        PollEditorUiConfig pollEditorUiConfig;
        int i4;
        wow wowVar2;
        izs<? super pnb0, s3q0> izsVar2;
        mob0 mob0Var;
        boolean z;
        Object x;
        mob0 mob0Var2 = this;
        izs<? super pnb0, s3q0> izsVar3 = izsVar;
        androidx.compose.runtime.a M = aVar.M(945723909);
        int i5 = i | (M.J(wpb0Var) ? 4 : 2) | (M.y(izsVar3) ? 32 : 16) | (M.y(mob0Var2) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(945723909, i5, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.PollEditorModalContentView.ThemedContent (PollEditorModalContentView.kt:47)");
            }
            xpb0 xpb0Var = (xpb0) mob0Var2.d(mob0Var2.f, (n0u0[]) Arrays.copyOf(new n0u0[]{wpb0Var.a}, 1), M, ((((i5 << 3) & 7168) | 4096) >> 3) & 896).getValue();
            if (xpb0Var instanceof xpb0.a) {
                M.K(-86117049);
                xpb0.a aVar5 = (xpb0.a) xpb0Var;
                yzt0<PostingPollDto> yzt0Var = aVar5.c;
                PollEditorUiConfig pollEditorUiConfig2 = aVar5.e;
                wh50 c2 = jk50.c(yzt0Var, M);
                Object x2 = M.x();
                Object obj = a.C0011a.a;
                if (x2 == obj) {
                    PostingPollDto postingPollDto = (PostingPollDto) c2.getValue();
                    i2 = i5;
                    x2 = androidx.compose.runtime.k.b(new yrb0(postingPollDto.f, postingPollDto.g, postingPollDto.h, postingPollDto.i, postingPollDto.d, postingPollDto.j));
                    M.R(x2);
                } else {
                    i2 = i5;
                }
                wh50 wh50Var3 = (wh50) x2;
                wh50Var3.setValue(yrb0.a((yrb0) wh50Var3.getValue(), null, false, false, false, false, ((PostingPollDto) c2.getValue()).j, 31));
                Object x3 = M.x();
                if (x3 == obj) {
                    int i6 = pollEditorUiConfig2.e;
                    if (i6 < 1) {
                        i6 = 1;
                    }
                    k9x k9xVar = new k9x(1, i6, 1);
                    ArrayList arrayList = new ArrayList(c5g.u(k9xVar, 10));
                    j9x it = k9xVar.iterator();
                    while (it.d) {
                        arrayList.add(new qv2(it.nextInt()));
                    }
                    x3 = androidx.compose.runtime.k.b(new wow(arrayList));
                    M.R(x3);
                }
                wh50 wh50Var4 = (wh50) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    PostingPollDto postingPollDto2 = (PostingPollDto) c2.getValue();
                    List<T> list = ((wow) wh50Var4.getValue()).b;
                    HashSet hashSet = new HashSet();
                    int size = postingPollDto2.e.size();
                    int i7 = pollEditorUiConfig2.h;
                    if (size < i7) {
                        size = i7;
                    }
                    int size2 = list.size();
                    if (size > size2) {
                        size = size2;
                    }
                    for (int i8 = 0; i8 < size; i8++) {
                        hashSet.add(list.get(i8));
                    }
                    x4 = androidx.compose.runtime.k.b(new wow(j5g.O0(hashSet)));
                    M.R(x4);
                }
                wh50 wh50Var5 = (wh50) x4;
                Object x5 = M.x();
                if (x5 == obj) {
                    PostingPollDto postingPollDto3 = (PostingPollDto) c2.getValue();
                    List<T> list2 = ((wow) wh50Var5.getValue()).b;
                    HashMap hashMap = new HashMap();
                    int i9 = 0;
                    for (PollAnswerDto pollAnswerDto : postingPollDto3.e) {
                        hashMap.put(list2.get(i9), new iv2(pollAnswerDto.b, pollAnswerDto.c));
                        i9++;
                        aVar5 = aVar5;
                        c2 = c2;
                    }
                    aVar3 = aVar5;
                    wh50Var = c2;
                    while (i9 < list2.size()) {
                        hashMap.put(list2.get(i9), new iv2((String) null, 3));
                        i9++;
                    }
                    x5 = androidx.compose.runtime.k.b(new bpw(hashMap));
                    M.R(x5);
                } else {
                    aVar3 = aVar5;
                    wh50Var = c2;
                }
                wh50 wh50Var6 = (wh50) x5;
                Object x6 = M.x();
                if (x6 == obj) {
                    x6 = androidx.compose.runtime.k.b(new gob0(0));
                    M.R(x6);
                }
                wh50 wh50Var7 = (wh50) x6;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new koj(2, wh50Var3);
                    M.R(x7);
                }
                gzs gzsVar2 = (gzs) x7;
                Object x8 = M.x();
                if (x8 == obj) {
                    x8 = new pd00(1, wh50Var3);
                    M.R(x8);
                }
                izs izsVar4 = (izs) x8;
                Object x9 = M.x();
                if (x9 == obj) {
                    x9 = new a(wh50Var6);
                    M.R(x9);
                }
                gzs gzsVar3 = (gzs) x9;
                Object x10 = M.x();
                if (x10 == obj) {
                    x10 = new b(wh50Var6);
                    M.R(x10);
                }
                izs izsVar5 = (izs) x10;
                Object x11 = M.x();
                if (x11 == obj) {
                    x11 = new c(wh50Var4);
                    M.R(x11);
                }
                gzs gzsVar4 = (gzs) x11;
                Object x12 = M.x();
                if (x12 == obj) {
                    x12 = new d(wh50Var4);
                    M.R(x12);
                }
                izs izsVar6 = (izs) x12;
                Object x13 = M.x();
                if (x13 == obj) {
                    x13 = new e(wh50Var5);
                    M.R(x13);
                }
                gzs gzsVar5 = (gzs) x13;
                Object x14 = M.x();
                if (x14 == obj) {
                    x14 = new f(wh50Var5);
                    M.R(x14);
                }
                izs izsVar7 = (izs) x14;
                Object x15 = M.x();
                if (x15 == obj) {
                    wh50Var2 = wh50Var4;
                    x15 = new qd00(2, wh50Var7);
                    M.R(x15);
                } else {
                    wh50Var2 = wh50Var4;
                }
                gzs gzsVar6 = (gzs) x15;
                Object x16 = M.x();
                if (x16 == obj) {
                    gzsVar = gzsVar6;
                    x16 = new c230(wh50Var7, 15);
                    M.R(x16);
                } else {
                    gzsVar = gzsVar6;
                }
                wh50 wh50Var8 = wh50Var;
                xpb0.a aVar6 = aVar3;
                aob0 aob0Var = new aob0(izsVar, gzsVar2, izsVar4, gzsVar3, izsVar5, gzsVar4, izsVar6, gzsVar5, izsVar7, gzsVar, (izs) x16);
                yrb0 yrb0Var = (yrb0) wh50Var3.getValue();
                wow wowVar3 = new wow(((wow) wh50Var2.getValue()).b);
                wow wowVar4 = new wow(((wow) wh50Var5.getValue()).b);
                bpw bpwVar2 = new bpw(((bpw) wh50Var6.getValue()).b);
                q630 d2 = rte0.d(q630.a.a, f5v0.c);
                PollEditorUiConfig pollEditorUiConfig3 = aVar6.e;
                boolean J = M.J(aob0Var) | M.J(xpb0Var);
                Object x17 = M.x();
                if (J || x17 == obj) {
                    x17 = new vue(3, aob0Var, (xpb0.a) xpb0Var);
                    M.R(x17);
                }
                wzs wzsVar = (wzs) x17;
                boolean J2 = M.J(aob0Var) | M.J(xpb0Var);
                Object x18 = M.x();
                if (J2 || x18 == obj) {
                    x18 = new yu1(20, aob0Var, (xpb0.a) xpb0Var);
                    M.R(x18);
                }
                izs izsVar8 = (izs) x18;
                boolean J3 = M.J(aob0Var);
                Object x19 = M.x();
                if (J3 || x19 == obj) {
                    x19 = new cr20(aob0Var, 20);
                    M.R(x19);
                }
                gzs gzsVar7 = (gzs) x19;
                int i10 = i2 & 112;
                boolean J4 = M.J(wh50Var8) | M.J(xpb0Var) | (i10 == 32);
                Object x20 = M.x();
                if (J4 || x20 == obj) {
                    xpb0.a aVar7 = (xpb0.a) xpb0Var;
                    aVar4 = aVar6;
                    i3 = 32;
                    bpwVar = bpwVar2;
                    wowVar = wowVar3;
                    pollEditorUiConfig = pollEditorUiConfig3;
                    i4 = i10;
                    wowVar2 = wowVar4;
                    m85 m85Var = new m85(aVar7, izsVar, wh50Var3, wh50Var2, wh50Var5, wh50Var6, wh50Var8, wh50Var7, 1);
                    izsVar2 = izsVar;
                    M.R(m85Var);
                    x20 = m85Var;
                } else {
                    aVar4 = aVar6;
                    pollEditorUiConfig = pollEditorUiConfig3;
                    wowVar = wowVar3;
                    wowVar2 = wowVar4;
                    bpwVar = bpwVar2;
                    i4 = i10;
                    i3 = 32;
                    izsVar2 = izsVar;
                }
                izs izsVar9 = (izs) x20;
                boolean z2 = i4 == i3;
                Object x21 = M.x();
                if (z2 || x21 == obj) {
                    x21 = new ega(izsVar2, 6);
                    M.R(x21);
                }
                gzs gzsVar8 = (gzs) x21;
                if ((i2 & 896) != 256) {
                    mob0Var = this;
                    if (!M.y(mob0Var)) {
                        z = false;
                        x = M.x();
                        if (!z || x == obj) {
                            x = new nly(mob0Var, 28);
                            M.R(x);
                        }
                        xpb0.a aVar8 = aVar4;
                        izsVar3 = izsVar2;
                        mob0Var2 = this;
                        pob0.a(aVar8, yrb0Var, aob0Var, d2, wowVar, wowVar2, bpwVar, pollEditorUiConfig, wzsVar, izsVar8, gzsVar7, izsVar3, izsVar9, gzsVar8, (gzs) x, M, 0);
                        aVar2 = M;
                        anm.a(aVar8, izsVar3, mob0Var2.g, aVar2, i4);
                        akm.a(aVar8, null, aVar2, 0);
                    }
                } else {
                    mob0Var = this;
                }
                z = true;
                x = M.x();
                if (!z) {
                }
                x = new nly(mob0Var, 28);
                M.R(x);
                xpb0.a aVar82 = aVar4;
                izsVar3 = izsVar2;
                mob0Var2 = this;
                pob0.a(aVar82, yrb0Var, aob0Var, d2, wowVar, wowVar2, bpwVar, pollEditorUiConfig, wzsVar, izsVar8, gzsVar7, izsVar3, izsVar9, gzsVar8, (gzs) x, M, 0);
                aVar2 = M;
                anm.a(aVar82, izsVar3, mob0Var2.g, aVar2, i4);
                akm.a(aVar82, null, aVar2, 0);
            } else {
                aVar2 = M;
                aVar2.K(-88886062);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lob0(mob0Var2, wpb0Var, izsVar3, i, 0);
        }
    }
}
