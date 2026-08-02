package xsna;

import android.R;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ListIterator;
import kotlin.jvm.internal.Lambda;
import xsna.cri;
import xsna.dt1;
import xsna.mi2;
import xsna.q630;
import xsna.wlp0;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class xh2 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    public static final class a<S> extends Lambda implements izs<li2<S>, llj> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final llj invoke(Object obj) {
            return xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.g(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4))), anp.f(jq2.d(90, 0, null, 6), 2));
        }
    }

    /* compiled from: AnimatedContent.kt */
    public static final class c extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ zzs<hi2, S, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ dt1 $contentAlignment;
        final /* synthetic */ izs<S, Object> $contentKey;
        final /* synthetic */ String $label;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ S $targetState;
        final /* synthetic */ izs<li2<S>, llj> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(S s, q630 q630Var, izs<? super li2<S>, llj> izsVar, dt1 dt1Var, String str, izs<? super S, ? extends Object> izsVar2, zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, int i, int i2) {
            super(2);
            this.$targetState = s;
            this.$modifier = q630Var;
            this.$transitionSpec = izsVar;
            this.$contentAlignment = dt1Var;
            this.$label = str;
            this.$contentKey = izsVar2;
            this.$content = zzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            xh2.a(this.$targetState, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$label, this.$contentKey, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    public static final class d<S> extends Lambda implements izs<li2<S>, llj> {
        public static final d i = new d(1);

        @Override // xsna.izs
        public final llj invoke(Object obj) {
            return xh2.c(anp.e(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4), 2).b(anp.g(jq2.d(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4))), anp.f(jq2.d(90, 0, null, 6), 2));
        }
    }

    /* compiled from: AnimatedContent.kt */
    public static final class f extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ zzs<hi2, S, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ mi2<S> $rootScope;
        final /* synthetic */ S $stateForContent;
        final /* synthetic */ wlp0<S> $this_AnimatedContent;
        final /* synthetic */ izs<li2<S>, llj> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(wlp0<S> wlp0Var, S s, izs<? super li2<S>, llj> izsVar, mi2<S> mi2Var, SnapshotStateList<S> snapshotStateList, zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar) {
            super(2);
            this.$this_AnimatedContent = wlp0Var;
            this.$stateForContent = s;
            this.$transitionSpec = izsVar;
            this.$rootScope = mi2Var;
            this.$currentlyVisible = snapshotStateList;
            this.$content = zzsVar;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-23915175, intValue, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                }
                izs<li2<S>, llj> izsVar = this.$transitionSpec;
                wlp0.b bVar = this.$rootScope;
                llj x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = izsVar.invoke(bVar);
                    aVar2.R(x);
                }
                llj lljVar = (llj) x;
                boolean l = aVar2.l(epx.f(this.$this_AnimatedContent.e().f(), this.$stateForContent));
                wlp0<S> wlp0Var = this.$this_AnimatedContent;
                S s = this.$stateForContent;
                izs<li2<S>, llj> izsVar2 = this.$transitionSpec;
                wlp0.b bVar2 = this.$rootScope;
                Object x2 = aVar2.x();
                if (l || x2 == c0012a) {
                    x2 = epx.f(wlp0Var.e().f(), s) ? d5q.a : izsVar2.invoke(bVar2).b;
                    aVar2.R(x2);
                }
                d5q d5qVar = (d5q) x2;
                S s2 = this.$stateForContent;
                wlp0<S> wlp0Var2 = this.$this_AnimatedContent;
                Object x3 = aVar2.x();
                if (x3 == c0012a) {
                    x3 = new mi2.a(epx.f(s2, ((zak0) wlp0Var2.d).getValue()));
                    aVar2.R(x3);
                }
                mi2.a aVar3 = (mi2.a) x3;
                qpp qppVar = lljVar.a;
                boolean y = aVar2.y(lljVar);
                Object x4 = aVar2.x();
                if (y || x4 == c0012a) {
                    x4 = new zh2(lljVar);
                    aVar2.R(x4);
                }
                q630 i = dd80.i(q630.a.a, (yzs) x4);
                ((zak0) aVar3.a).setValue(Boolean.valueOf(epx.f(this.$stateForContent, ((zak0) this.$this_AnimatedContent.d).getValue())));
                q630 g = i.g(aVar3);
                wlp0<S> wlp0Var3 = this.$this_AnimatedContent;
                boolean y2 = aVar2.y(this.$stateForContent);
                S s3 = this.$stateForContent;
                Object x5 = aVar2.x();
                if (y2 || x5 == c0012a) {
                    x5 = new ai2(s3);
                    aVar2.R(x5);
                }
                izs izsVar3 = (izs) x5;
                boolean J = aVar2.J(d5qVar);
                Object x6 = aVar2.x();
                if (J || x6 == c0012a) {
                    x6 = new bi2(d5qVar);
                    aVar2.R(x6);
                }
                mm2.a(wlp0Var3, izsVar3, g, qppVar, d5qVar, (wzs) x6, kai.c(-143346359, new ei2(this.$currentlyVisible, this.$stateForContent, this.$rootScope, this.$content), aVar2), aVar2, 12582912, 64);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: AnimatedContent.kt */
    public static final class g extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ zzs<hi2, S, androidx.compose.runtime.a, Integer, s3q0> $content;
        final /* synthetic */ dt1 $contentAlignment;
        final /* synthetic */ izs<S, Object> $contentKey;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ wlp0<S> $this_AnimatedContent;
        final /* synthetic */ izs<li2<S>, llj> $transitionSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(wlp0<S> wlp0Var, q630 q630Var, izs<? super li2<S>, llj> izsVar, dt1 dt1Var, izs<? super S, ? extends Object> izsVar2, zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, int i, int i2) {
            super(2);
            this.$this_AnimatedContent = wlp0Var;
            this.$modifier = q630Var;
            this.$transitionSpec = izsVar;
            this.$contentAlignment = dt1Var;
            this.$contentKey = izsVar2;
            this.$content = zzsVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            xh2.b(this.$this_AnimatedContent, this.$modifier, this.$transitionSpec, this.$contentAlignment, this.$contentKey, this.$content, aVar, ne7.I(this.$$changed | 1), this.$$default);
            return s3q0.a;
        }
    }

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void a(S s, q630 q630Var, izs<? super li2<S>, llj> izsVar, dt1 dt1Var, String str, izs<? super S, ? extends Object> izsVar2, zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        int i4;
        izs<? super li2<S>, llj> izsVar3;
        int i5;
        dt1 dt1Var2;
        int i6;
        int i7;
        izs<? super S, ? extends Object> izsVar4;
        zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar2;
        q630 q630Var2;
        String str2;
        izs<? super li2<S>, llj> izsVar5;
        dt1 dt1Var3;
        androidx.compose.runtime.f s2;
        int i8;
        q630 q630Var3;
        izs<? super li2<S>, llj> izsVar6;
        int i9;
        dt1 dt1Var4;
        androidx.compose.runtime.a M = aVar.M(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(s) : M.y(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                izsVar3 = izsVar;
                i3 |= M.y(izsVar3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    dt1Var2 = dt1Var;
                    i3 |= M.J(dt1Var2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= M.J(str) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            izsVar4 = izsVar2;
                            i3 |= M.y(izsVar4) ? 131072 : 65536;
                            if ((1572864 & i) != 0) {
                                zzsVar2 = zzsVar;
                                i3 |= M.y(zzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                            } else {
                                zzsVar2 = zzsVar;
                            }
                            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                                M.h();
                                q630Var2 = q630Var;
                                str2 = str;
                                izsVar5 = izsVar3;
                                dt1Var3 = dt1Var2;
                            } else {
                                if (i10 != 0) {
                                    q630Var3 = q630.a.a;
                                    i8 = i6;
                                } else {
                                    i8 = i6;
                                    q630Var3 = q630Var;
                                }
                                a.C0011a.C0012a c0012a = a.C0011a.a;
                                if (i4 != 0) {
                                    Object x = M.x();
                                    if (x == c0012a) {
                                        x = a.i;
                                        M.R(x);
                                    }
                                    izsVar6 = (izs) x;
                                } else {
                                    izsVar6 = izsVar3;
                                }
                                if (i5 != 0) {
                                    dt1.a.getClass();
                                    dt1Var4 = dt1.a.b;
                                    i9 = i7;
                                } else {
                                    i9 = i7;
                                    dt1Var4 = dt1Var2;
                                }
                                String str3 = i8 != 0 ? "AnimatedContent" : str;
                                if (i9 != 0) {
                                    Object x2 = M.x();
                                    if (x2 == c0012a) {
                                        x2 = b.i;
                                        M.R(x2);
                                    }
                                    izsVar4 = (izs) x2;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                wlp0 e2 = ump0.e(s, str3, M, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i11 = i3 & 8176;
                                int i12 = i3 >> 3;
                                b(e2, q630Var3, izsVar6, dt1Var4, izsVar4, zzsVar2, M, i11 | (57344 & i12) | (i12 & 458752), 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                str2 = str3;
                                q630Var2 = q630Var3;
                                izsVar5 = izsVar6;
                                dt1Var3 = dt1Var4;
                            }
                            izs<? super S, ? extends Object> izsVar7 = izsVar4;
                            s2 = M.s();
                            if (s2 == null) {
                                s2.d = new c(s, q630Var2, izsVar5, dt1Var3, str2, izsVar7, zzsVar, i, i2);
                                return;
                            }
                            return;
                        }
                        izsVar4 = izsVar2;
                        if ((1572864 & i) != 0) {
                        }
                        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        }
                        izs<? super S, ? extends Object> izsVar72 = izsVar4;
                        s2 = M.s();
                        if (s2 == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    izsVar4 = izsVar2;
                    if ((1572864 & i) != 0) {
                    }
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                    }
                    izs<? super S, ? extends Object> izsVar722 = izsVar4;
                    s2 = M.s();
                    if (s2 == null) {
                    }
                }
                dt1Var2 = dt1Var;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                izsVar4 = izsVar2;
                if ((1572864 & i) != 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                izs<? super S, ? extends Object> izsVar7222 = izsVar4;
                s2 = M.s();
                if (s2 == null) {
                }
            }
            izsVar3 = izsVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            dt1Var2 = dt1Var;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            izsVar4 = izsVar2;
            if ((1572864 & i) != 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            izs<? super S, ? extends Object> izsVar72222 = izsVar4;
            s2 = M.s();
            if (s2 == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        izsVar3 = izsVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        dt1Var2 = dt1Var;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        izsVar4 = izsVar2;
        if ((1572864 & i) != 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        izs<? super S, ? extends Object> izsVar722222 = izsVar4;
        s2 = M.s();
        if (s2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void b(wlp0<S> wlp0Var, q630 q630Var, izs<? super li2<S>, llj> izsVar, dt1 dt1Var, izs<? super S, ? extends Object> izsVar2, zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        izs<? super li2<S>, llj> izsVar3;
        int i5;
        dt1 dt1Var2;
        int i6;
        izs<? super S, ? extends Object> izsVar4;
        zzs<? super hi2, ? super S, ? super androidx.compose.runtime.a, ? super Integer, s3q0> zzsVar2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        izs<? super li2<S>, llj> izsVar5;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        SnapshotStateList snapshotStateList;
        izs<? super li2<S>, llj> izsVar6;
        mi2 mi2Var;
        ph50 ph50Var;
        Object obj;
        izs<? super li2<S>, llj> izsVar7;
        SnapshotStateList snapshotStateList2;
        mi2 mi2Var2;
        wlp0.a aVar3;
        androidx.compose.runtime.a M = aVar.M(511725103);
        if ((i & 6) == 0) {
            i3 = (M.J(wlp0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                izsVar3 = izsVar;
                i3 |= M.y(izsVar3) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    dt1Var2 = dt1Var;
                    i3 |= M.J(dt1Var2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        izsVar4 = izsVar2;
                        i3 |= M.y(izsVar4) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            zzsVar2 = zzsVar;
                            i3 |= M.y(zzsVar2) ? 131072 : 65536;
                        } else {
                            zzsVar2 = zzsVar;
                        }
                        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                            q630 q630Var5 = q630.a.a;
                            if (i7 != 0) {
                                q630Var2 = q630Var5;
                            }
                            Object obj2 = a.C0011a.a;
                            if (i4 != 0) {
                                Object x = M.x();
                                if (x == obj2) {
                                    x = d.i;
                                    M.R(x);
                                }
                                izsVar3 = (izs) x;
                            }
                            if (i5 != 0) {
                                dt1.a.getClass();
                                dt1Var2 = dt1.a.b;
                            }
                            if (i6 != 0) {
                                Object x2 = M.x();
                                if (x2 == obj2) {
                                    x2 = e.i;
                                    M.R(x2);
                                }
                                izsVar4 = (izs) x2;
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(511725103, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            LayoutDirection layoutDirection = (LayoutDirection) M.r(uvi.n);
                            int i8 = i3 & 14;
                            boolean z = i8 == 4;
                            Object x3 = M.x();
                            if (z || x3 == obj2) {
                                x3 = new mi2(wlp0Var, dt1Var2, layoutDirection);
                                M.R(x3);
                            }
                            mi2 mi2Var3 = (mi2) x3;
                            boolean z2 = i8 == 4;
                            Object x4 = M.x();
                            Object obj3 = x4;
                            if (z2 || x4 == obj2) {
                                Object[] objArr = {wlp0Var.a.B()};
                                SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                                snapshotStateList3.addAll(rl3.u0(objArr));
                                M.R(snapshotStateList3);
                                obj3 = snapshotStateList3;
                            }
                            SnapshotStateList snapshotStateList4 = (SnapshotStateList) obj3;
                            boolean z3 = i8 == 4;
                            Object x5 = M.x();
                            if (z3 || x5 == obj2) {
                                x5 = h5h0.b();
                                M.R(x5);
                            }
                            ph50 ph50Var2 = (ph50) x5;
                            z46 z46Var = wlp0Var.a;
                            wh50 wh50Var = wlp0Var.d;
                            if (!snapshotStateList4.contains(z46Var.B())) {
                                snapshotStateList4.clear();
                                snapshotStateList4.add(z46Var.B());
                            }
                            zak0 zak0Var = (zak0) wh50Var;
                            if (epx.f(z46Var.B(), zak0Var.getValue())) {
                                if (snapshotStateList4.size() != 1 || !epx.f(snapshotStateList4.get(0), z46Var.B())) {
                                    snapshotStateList4.clear();
                                    snapshotStateList4.add(z46Var.B());
                                }
                                if (ph50Var2.e != 1 || ph50Var2.b(z46Var.B())) {
                                    ph50Var2.h();
                                }
                                mi2Var3.b = dt1Var2;
                                mi2Var3.c = layoutDirection;
                            }
                            if (!epx.f(z46Var.B(), zak0Var.getValue()) && !snapshotStateList4.contains(zak0Var.getValue())) {
                                ListIterator listIterator = snapshotStateList4.listIterator();
                                int i9 = 0;
                                while (true) {
                                    duk0 duk0Var = (duk0) listIterator;
                                    if (!duk0Var.hasNext()) {
                                        i9 = -1;
                                        break;
                                    }
                                    ListIterator listIterator2 = listIterator;
                                    if (epx.f(izsVar4.invoke((Object) duk0Var.next()), izsVar4.invoke((Object) zak0Var.getValue()))) {
                                        break;
                                    }
                                    i9++;
                                    listIterator = listIterator2;
                                }
                                if (i9 == -1) {
                                    snapshotStateList4.add(zak0Var.getValue());
                                } else {
                                    snapshotStateList4.set(i9, zak0Var.getValue());
                                }
                            }
                            if (ph50Var2.b(zak0Var.getValue()) && ph50Var2.b(z46Var.B())) {
                                M.K(1968995539);
                                M.j();
                                q630Var4 = q630Var2;
                                snapshotStateList = snapshotStateList4;
                                izsVar6 = izsVar3;
                                mi2Var = mi2Var3;
                                ph50Var = ph50Var2;
                                obj = obj2;
                            } else {
                                M.K(1966410449);
                                ph50Var2.h();
                                int size = snapshotStateList4.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    ph50 ph50Var3 = ph50Var2;
                                    Object obj4 = snapshotStateList4.get(i10);
                                    izs<? super li2<S>, llj> izsVar8 = izsVar3;
                                    mi2 mi2Var4 = mi2Var3;
                                    SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                    ph50Var3.p(obj4, kai.c(-23915175, new f(wlp0Var, obj4, izsVar8, mi2Var4, snapshotStateList5, zzsVar2), M));
                                    mi2Var3 = mi2Var4;
                                    i10++;
                                    ph50Var2 = ph50Var3;
                                    snapshotStateList4 = snapshotStateList5;
                                    q630Var2 = q630Var2;
                                    obj2 = obj2;
                                    izsVar3 = izsVar8;
                                    size = size;
                                    zzsVar2 = zzsVar;
                                }
                                SnapshotStateList snapshotStateList6 = snapshotStateList4;
                                q630Var4 = q630Var2;
                                snapshotStateList = snapshotStateList6;
                                izsVar6 = izsVar3;
                                mi2Var = mi2Var3;
                                ph50Var = ph50Var2;
                                obj = obj2;
                                M.j();
                            }
                            boolean J = M.J(wlp0Var.e()) | M.J(mi2Var);
                            Object x6 = M.x();
                            if (J || x6 == obj) {
                                x6 = (llj) izsVar6.invoke(mi2Var);
                                M.R(x6);
                            }
                            llj lljVar = (llj) x6;
                            wlp0<S> wlp0Var2 = mi2Var.a;
                            if (androidx.compose.runtime.b.d()) {
                                izsVar7 = izsVar6;
                                androidx.compose.runtime.b.f(93755870, 0, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:557)");
                            } else {
                                izsVar7 = izsVar6;
                            }
                            boolean J2 = M.J(mi2Var);
                            Object x7 = M.x();
                            if (J2 || x7 == obj) {
                                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                                M.R(x7);
                            }
                            wh50 wh50Var2 = (wh50) x7;
                            wh50 c2 = androidx.compose.runtime.k.c(lljVar.d, M, 0);
                            if (epx.f(wlp0Var2.a.B(), ((zak0) wlp0Var2.d).getValue())) {
                                wh50Var2.setValue(Boolean.FALSE);
                            } else if (c2.getValue() != 0) {
                                wh50Var2.setValue(Boolean.TRUE);
                            }
                            if (((Boolean) wh50Var2.getValue()).booleanValue()) {
                                M.K(1353077497);
                                mi2 mi2Var5 = mi2Var;
                                snapshotStateList2 = snapshotStateList;
                                mi2Var2 = mi2Var5;
                                aVar2 = M;
                                aVar3 = ump0.b(mi2Var5.a, rte0.l, null, aVar2, 0, 2);
                                boolean J3 = aVar2.J(aVar3);
                                Object x8 = aVar2.x();
                                if (J3 || x8 == obj) {
                                    wxj0 wxj0Var = (wxj0) c2.getValue();
                                    if (wxj0Var == null || wxj0Var.a()) {
                                        q630Var5 = rte0.e(q630Var5);
                                    }
                                    aVar2.R(q630Var5);
                                    x8 = q630Var5;
                                }
                                q630Var5 = (q630) x8;
                                aVar2.j();
                            } else {
                                snapshotStateList2 = snapshotStateList;
                                aVar2 = M;
                                mi2Var2 = mi2Var;
                                aVar2.K(1353343539);
                                aVar2.j();
                                mi2Var2.f = null;
                                aVar3 = null;
                            }
                            q630 g2 = q630Var5.g(new mi2.b(aVar3, c2, mi2Var2));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630 g3 = q630Var4.g(g2);
                            Object x9 = aVar2.x();
                            if (x9 == obj) {
                                x9 = new gi2(mi2Var2);
                                aVar2.R(x9);
                            }
                            gi2 gi2Var = (gi2) x9;
                            int hashCode = Long.hashCode(n34.n(aVar2));
                            sy90 D = aVar2.D();
                            q630 c3 = qri.c(aVar2, g3);
                            cri.h7.getClass();
                            LayoutNode.a aVar4 = cri.a.b;
                            if (aVar2.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar2.H();
                            if (aVar2.L()) {
                                aVar2.I(aVar4);
                            } else {
                                aVar2.f();
                            }
                            k9q0.w(aVar2, gi2Var, cri.a.f);
                            k9q0.w(aVar2, D, cri.a.e);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            if (aVar2.L()) {
                                aVar2.b(valueOf, bVar);
                            }
                            k9q0.t(aVar2, cri.a.h);
                            k9q0.w(aVar2, c3, cri.a.d);
                            aVar2.K(-860173498);
                            int size2 = snapshotStateList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                SnapshotStateList snapshotStateList7 = snapshotStateList2;
                                R r = (Object) snapshotStateList7.get(i11);
                                aVar2.W(-2026002954, izsVar4.invoke(r));
                                wzs wzsVar = (wzs) ph50Var.d(r);
                                if (wzsVar == null) {
                                    aVar2.K(1618454323);
                                    aVar2.j();
                                } else {
                                    aVar2.K(-2026001778);
                                    wzsVar.invoke(aVar2, 0);
                                    aVar2.j();
                                }
                                aVar2.a0();
                                i11++;
                                snapshotStateList2 = snapshotStateList7;
                            }
                            if (gp.d(aVar2)) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var4;
                            izsVar5 = izsVar7;
                        } else {
                            aVar2 = M;
                            aVar2.h();
                            q630Var3 = q630Var2;
                            izsVar5 = izsVar3;
                        }
                        androidx.compose.runtime.a aVar5 = aVar2;
                        dt1 dt1Var3 = dt1Var2;
                        izs<? super S, ? extends Object> izsVar9 = izsVar4;
                        s = aVar5.s();
                        if (s != null) {
                            s.d = new g(wlp0Var, q630Var3, izsVar5, dt1Var3, izsVar9, zzsVar, i, i2);
                            return;
                        }
                        return;
                    }
                    izsVar4 = izsVar2;
                    if ((196608 & i) == 0) {
                    }
                    if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    androidx.compose.runtime.a aVar52 = aVar2;
                    dt1 dt1Var32 = dt1Var2;
                    izs<? super S, ? extends Object> izsVar92 = izsVar4;
                    s = aVar52.s();
                    if (s != null) {
                    }
                }
                dt1Var2 = dt1Var;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                izsVar4 = izsVar2;
                if ((196608 & i) == 0) {
                }
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                }
                androidx.compose.runtime.a aVar522 = aVar2;
                dt1 dt1Var322 = dt1Var2;
                izs<? super S, ? extends Object> izsVar922 = izsVar4;
                s = aVar522.s();
                if (s != null) {
                }
            }
            izsVar3 = izsVar;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            dt1Var2 = dt1Var;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            izsVar4 = izsVar2;
            if ((196608 & i) == 0) {
            }
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            androidx.compose.runtime.a aVar5222 = aVar2;
            dt1 dt1Var3222 = dt1Var2;
            izs<? super S, ? extends Object> izsVar9222 = izsVar4;
            s = aVar5222.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        izsVar3 = izsVar;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        dt1Var2 = dt1Var;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        izsVar4 = izsVar2;
        if ((196608 & i) == 0) {
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        androidx.compose.runtime.a aVar52222 = aVar2;
        dt1 dt1Var32222 = dt1Var2;
        izs<? super S, ? extends Object> izsVar92222 = izsVar4;
        s = aVar52222.s();
        if (s != null) {
        }
    }

    public static final llj c(qpp qppVar, d5q d5qVar) {
        return new llj(qppVar, d5qVar, 12);
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    public static final class b<S> extends Lambda implements izs<S, S> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final S invoke(S s) {
            return s;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* compiled from: AnimatedContent.kt */
    public static final class e<S> extends Lambda implements izs<S, S> {
        public static final e i = new e(1);

        @Override // xsna.izs
        public final S invoke(S s) {
            return s;
        }
    }
}
