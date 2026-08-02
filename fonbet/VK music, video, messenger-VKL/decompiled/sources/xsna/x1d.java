package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.viewer.experiments.models.ClipsMarketItemsShowTimeConfig;
import xsna.qzb0;

/* compiled from: ClipItemOnPositionUpdateEventFilter.kt */
/* loaded from: classes17.dex */
public final class x1d {
    public final ClipFeedTab a;
    public final yof b;
    public final j1d c;
    public c d = new b();

    /* compiled from: ClipItemOnPositionUpdateEventFilter.kt */
    public static final class a implements c {
        public final ClipFeedTab a;
        public final yof b;
        public final j1d c;
        public SdkClipVideoFile d;
        public lfj0 e;
        public qzb0.a f;
        public qzb0.e g;
        public qzb0.c h;
        public qzb0.d i;
        public qzb0.b j;

        /* compiled from: ClipItemOnPositionUpdateEventFilter.kt */
        /* renamed from: xsna.x1d$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3969a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClipsMarketItemsShowTimeConfig.VisibilityMode.values().length];
                try {
                    iArr[ClipsMarketItemsShowTimeConfig.VisibilityMode.VISIBLE_AFTER_PERCENT_PLAYED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClipsMarketItemsShowTimeConfig.VisibilityMode.VISIBLE_AFTER_TIME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(ClipFeedTab clipFeedTab, yof yofVar, j1d j1dVar, SdkClipVideoFile sdkClipVideoFile) {
            Long l;
            this.a = clipFeedTab;
            this.b = yofVar;
            this.c = j1dVar;
            this.d = sdkClipVideoFile;
            this.e = new lfj0(clipFeedTab, yofVar, sdkClipVideoFile);
            SdkClipVideoFile sdkClipVideoFile2 = this.d;
            maf J = yofVar.J();
            J = J.a ? J : null;
            if (J != null) {
                ClipFeedTab.Discover.b.getClass();
                l = Long.valueOf(ClipFeedTab.Ab(clipFeedTab) ? 0L : J.c);
            } else {
                l = null;
            }
            qzb0.a aVar = new qzb0.a(we7.l(sdkClipVideoFile2, 0L, l), we7.k(sdkClipVideoFile2, 0L), we7.j(sdkClipVideoFile2, 0L));
            qzb0.e eVar = new qzb0.e();
            qzb0.c cVar = new qzb0.c();
            boolean z = true;
            if (sdkClipVideoFile2.d3() == null || !(!r2.b.isEmpty())) {
                SdkClipsAdsFeaturesParams d3 = sdkClipVideoFile2.d3();
                if ((d3 != null ? d3.d : null) == null) {
                    z = false;
                }
            }
            qzb0.b bVar = new qzb0.b(false, false, z);
            qzb0.d dVar = new qzb0.d(false, false);
            this.f = aVar;
            this.g = eVar;
            this.h = cVar;
            this.i = dVar;
            this.j = bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:94:0x00bf, code lost:
        
            if (r23 > (r14 * 1000)) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x00c1, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x00cc, code lost:
        
            if (r23 > (r25 * r14)) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x017b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0082  */
        @Override // xsna.x1d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(long j, long j2) {
            boolean j3;
            boolean z;
            qzb0.e eVar;
            boolean z2;
            boolean z3;
            boolean z4;
            qzb0.c cVar;
            int i;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            qzb0.b bVar;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            SdkClipVideoFile sdkClipVideoFile = this.d;
            qzb0.a aVar = this.f;
            yof yofVar = this.b;
            maf J = yofVar.J();
            Long valueOf = Long.valueOf(J.c);
            if (!J.a) {
                valueOf = null;
            }
            boolean l = we7.l(sdkClipVideoFile, j, valueOf);
            boolean k = we7.k(sdkClipVideoFile, j);
            if (yofVar.P().a()) {
                SdkActionLink m1 = sdkClipVideoFile.m1();
                if (epx.f(m1 != null ? m1.e : null, "video")) {
                    j3 = Math.max(j, 0L) >= 3000;
                    if (l != aVar.a && k == aVar.b && j3 == aVar.c) {
                        z = false;
                    } else {
                        this.f = new qzb0.a(l, k, j3);
                        z = true;
                    }
                    eVar = this.g;
                    float f = j;
                    float f2 = j2;
                    z2 = f <= 0.75f * f2;
                    z3 = f <= 0.95f * f2;
                    if (z2 == eVar.a || z3 != eVar.b) {
                        this.g = new qzb0.e(z2, z3);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar = this.h;
                    ClipsMarketItemsShowTimeConfig n = yofVar.n();
                    ClipsMarketItemsShowTimeConfig.VisibilityMode visibilityMode = n.b;
                    double d = n.c;
                    i = C3969a.$EnumSwitchMapping$0[visibilityMode.ordinal()];
                    if (i == 1) {
                        if (i != 2) {
                            z5 = z;
                            z6 = z4;
                        } else {
                            z5 = z;
                            z6 = z4;
                        }
                        z7 = false;
                    } else {
                        z5 = z;
                        z6 = z4;
                    }
                    if (z7 == cVar.a) {
                        this.h = new qzb0.c(true);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    bVar = this.j;
                    z9 = bVar.c;
                    z10 = j <= (!z9 ? 3000L : 5000L) - 2000;
                    z11 = j <= (!z9 ? 3000L : 5000L);
                    if (z10 == bVar.b || z11 != bVar.a) {
                        this.j = new qzb0.b(z11, z10, z9);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (this.e.b) {
                        boolean z15 = f >= swe0.f((((float) (((long) yofVar.W().b) * j2)) / 100.0f) - ((float) yofVar.L().c), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
                        qzb0.d dVar = this.i;
                        if (z15 != dVar.b) {
                            this.i = new qzb0.d(dVar.a, true);
                            z13 = true;
                            if (this.e.a) {
                                boolean z16 = f >= ((float) (j2 * ((long) yofVar.W().b))) / 100.0f;
                                qzb0.d dVar2 = this.i;
                                if (z16 != dVar2.a) {
                                    this.i = new qzb0.d(true, dVar2.b);
                                    z14 = true;
                                    if (!z5 || z6 || z8 || z12 || z14 || z13) {
                                        this.c.a(new l6d(new qzb0(this.f, this.g, this.h, this.j, this.i)));
                                    }
                                    return;
                                }
                            }
                            z14 = false;
                            if (z5) {
                            }
                            this.c.a(new l6d(new qzb0(this.f, this.g, this.h, this.j, this.i)));
                        }
                    }
                    z13 = false;
                    if (this.e.a) {
                    }
                    z14 = false;
                    if (z5) {
                    }
                    this.c.a(new l6d(new qzb0(this.f, this.g, this.h, this.j, this.i)));
                }
            }
            j3 = we7.j(sdkClipVideoFile, j);
            if (l != aVar.a) {
            }
            this.f = new qzb0.a(l, k, j3);
            z = true;
            eVar = this.g;
            float f3 = j;
            float f22 = j2;
            if (f3 <= 0.75f * f22) {
            }
            if (f3 <= 0.95f * f22) {
            }
            if (z2 == eVar.a) {
            }
            this.g = new qzb0.e(z2, z3);
            z4 = true;
            cVar = this.h;
            ClipsMarketItemsShowTimeConfig n2 = yofVar.n();
            ClipsMarketItemsShowTimeConfig.VisibilityMode visibilityMode2 = n2.b;
            double d2 = n2.c;
            i = C3969a.$EnumSwitchMapping$0[visibilityMode2.ordinal()];
            if (i == 1) {
            }
            if (z7 == cVar.a) {
            }
            bVar = this.j;
            z9 = bVar.c;
            if (j <= (!z9 ? 3000L : 5000L) - 2000) {
            }
            if (j <= (!z9 ? 3000L : 5000L)) {
            }
            if (z10 == bVar.b) {
            }
            this.j = new qzb0.b(z11, z10, z9);
            z12 = true;
            if (this.e.b) {
            }
            z13 = false;
            if (this.e.a) {
            }
            z14 = false;
            if (z5) {
            }
            this.c.a(new l6d(new qzb0(this.f, this.g, this.h, this.j, this.i)));
        }
    }

    /* compiled from: ClipItemOnPositionUpdateEventFilter.kt */
    public static final class b implements c {
        public Long a;
        public Long b;

        @Override // xsna.x1d.c
        public final void a(long j, long j2) {
            this.a = Long.valueOf(j);
            this.b = Long.valueOf(j2);
        }
    }

    /* compiled from: ClipItemOnPositionUpdateEventFilter.kt */
    public interface c {
        void a(long j, long j2);
    }

    public x1d(ClipFeedTab clipFeedTab, yof yofVar, j1d j1dVar) {
        this.a = clipFeedTab;
        this.b = yofVar;
        this.c = j1dVar;
    }
}
