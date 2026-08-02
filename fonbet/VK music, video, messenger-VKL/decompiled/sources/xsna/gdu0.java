package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: VkAutoPlayVideo.kt */
/* loaded from: classes17.dex */
public final class gdu0 {

    /* compiled from: VkAutoPlayVideo.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final VideoFile videoFile, final q630 q630Var, com.vk.libvideo.autoplay.a aVar, boolean z, boolean z2, izs izsVar, izs izsVar2, izs izsVar3, izs izsVar4, izs izsVar5, izs izsVar6, izs izsVar7, final wzs wzsVar, izs izsVar8, izs izsVar9, wzs wzsVar2, yzs yzsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        izs izsVar10;
        int i6;
        final izs izsVar11;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.runtime.a aVar3;
        final com.vk.libvideo.autoplay.a aVar4;
        final izs izsVar12;
        final izs izsVar13;
        final izs izsVar14;
        final izs izsVar15;
        final wzs wzsVar3;
        final yzs yzsVar2;
        final boolean z5;
        final boolean z6;
        final izs izsVar16;
        final izs izsVar17;
        final izs izsVar18;
        final izs izsVar19;
        androidx.compose.runtime.f s;
        com.vk.libvideo.autoplay.a aVar5;
        izs izsVar20;
        izs izsVar21;
        izs izsVar22;
        izs izsVar23;
        izs izsVar24;
        izs izsVar25;
        izs izsVar26;
        izs izsVar27;
        wzs wzsVar4;
        wzs wzsVar5;
        izs izsVar28;
        yzs yzsVar3;
        int i20;
        boolean z7;
        boolean z8;
        com.vk.libvideo.autoplay.a aVar6;
        izs izsVar29;
        wzs wzsVar6;
        izs izsVar30;
        izs izsVar31;
        izs izsVar32;
        wzs wzsVar7;
        int i21;
        izs izsVar33;
        VideoTextureView videoTextureView;
        izs izsVar34;
        com.vk.libvideo.autoplay.a aVar7;
        com.vk.libvideo.autoplay.a aVar8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object x;
        izs izsVar35;
        yg5 yg5Var;
        VideoTextureView videoTextureView2;
        com.vk.libvideo.autoplay.a aVar9;
        boolean y;
        Object x2;
        int i22;
        int i23;
        androidx.compose.runtime.a M = aVar2.M(-883206779);
        if ((i & 6) == 0) {
            i3 = (M.y(videoFile) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? M.J(aVar) : M.y(aVar)) {
                    i23 = 256;
                    i3 |= i23;
                }
            }
            i23 = 128;
            i3 |= i23;
        }
        int i24 = i2 & 8;
        if (i24 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z3 = z;
            i3 |= M.l(z3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= M.l(z4) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                    izsVar10 = izsVar;
                } else {
                    izsVar10 = izsVar;
                    if ((i & 196608) == 0) {
                        i3 |= M.y(izsVar10) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    izsVar11 = izsVar2;
                } else {
                    izsVar11 = izsVar2;
                    if ((i & 1572864) == 0) {
                        i3 |= M.y(izsVar11) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= M.y(izsVar3) ? 8388608 : 4194304;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= M.y(izsVar4) ? 67108864 : 33554432;
                }
                i9 = i2 & 512;
                if (i9 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i10 = i9;
                    i3 |= M.y(izsVar5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    int i25 = !M.y(wzsVar) ? 256 : 128;
                    int i26 = 54 | i25;
                    i11 = i2 & 8192;
                    if (i11 == 0) {
                        i12 = i25 | 3126;
                    } else {
                        i12 = i26 | (M.y(izsVar8) ? 2048 : 1024);
                    }
                    i13 = i2 & 16384;
                    if (i13 == 0) {
                        i14 = i12 | 24576;
                    } else {
                        i14 = i12 | (M.y(izsVar9) ? 16384 : 8192);
                    }
                    i15 = i2 & 32768;
                    if (i15 == 0) {
                        i16 = i14 | 196608;
                    } else {
                        i16 = i14 | (M.y(wzsVar2) ? 131072 : 65536);
                    }
                    i17 = i2 & 65536;
                    if (i17 == 0) {
                        i18 = i16 | 1572864;
                    } else {
                        i18 = i16 | (M.y(yzsVar) ? 1048576 : 524288);
                    }
                    i19 = i18;
                    if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (599187 & i19) != 599186)) {
                        aVar3 = M;
                        aVar3.h();
                        aVar4 = aVar;
                        izsVar12 = izsVar3;
                        izsVar13 = izsVar4;
                        izsVar14 = izsVar5;
                        izsVar15 = izsVar7;
                        wzsVar3 = wzsVar2;
                        yzsVar2 = yzsVar;
                        z5 = z3;
                        z6 = z4;
                        izsVar16 = izsVar10;
                        izsVar17 = izsVar6;
                        izsVar18 = izsVar8;
                        izsVar19 = izsVar9;
                    } else {
                        M.V();
                        int i27 = i & 1;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        int i28 = 6;
                        if (i27 == 0 || M.i()) {
                            if ((i2 & 4) != 0) {
                                aVar5 = new com.vk.libvideo.autoplay.a(false, null, null, false, false, false, null, null, null, null, null, null, false, null, 524287);
                                i3 &= -897;
                            } else {
                                aVar5 = aVar;
                            }
                            if (i24 != 0) {
                                z3 = true;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if (i5 != 0) {
                                Object x3 = M.x();
                                if (x3 == c0012a) {
                                    x3 = new fuh0(9);
                                    M.R(x3);
                                }
                                izsVar10 = (izs) x3;
                            }
                            int i29 = 10;
                            if (i6 != 0) {
                                Object x4 = M.x();
                                if (x4 == c0012a) {
                                    x4 = new fxi0(i29);
                                    M.R(x4);
                                }
                                izsVar11 = (izs) x4;
                            }
                            if (i7 != 0) {
                                Object x5 = M.x();
                                if (x5 == c0012a) {
                                    x5 = new eyp0(i29);
                                    M.R(x5);
                                }
                                izsVar20 = (izs) x5;
                            } else {
                                izsVar20 = izsVar3;
                            }
                            if (i8 != 0) {
                                Object x6 = M.x();
                                if (x6 == c0012a) {
                                    x6 = new h2h0(14);
                                    M.R(x6);
                                }
                                izsVar21 = (izs) x6;
                            } else {
                                izsVar21 = izsVar4;
                            }
                            if (i10 != 0) {
                                Object x7 = M.x();
                                if (x7 == c0012a) {
                                    x7 = new b1o0(i28);
                                    M.R(x7);
                                }
                                izsVar14 = (izs) x7;
                            } else {
                                izsVar14 = izsVar5;
                            }
                            Object x8 = M.x();
                            if (x8 == c0012a) {
                                x8 = new yjs0(4);
                                M.R(x8);
                            }
                            izs izsVar36 = (izs) x8;
                            Object x9 = M.x();
                            if (x9 == c0012a) {
                                izsVar22 = izsVar20;
                                x9 = new puq0(6);
                                M.R(x9);
                            } else {
                                izsVar22 = izsVar20;
                            }
                            izs izsVar37 = (izs) x9;
                            if (i11 != 0) {
                                Object x10 = M.x();
                                if (x10 == c0012a) {
                                    izsVar23 = izsVar37;
                                    x10 = new lir0(8);
                                    M.R(x10);
                                } else {
                                    izsVar23 = izsVar37;
                                }
                                izsVar24 = (izs) x10;
                            } else {
                                izsVar23 = izsVar37;
                                izsVar24 = izsVar8;
                            }
                            if (i13 != 0) {
                                Object x11 = M.x();
                                if (x11 == c0012a) {
                                    izsVar25 = izsVar24;
                                    x11 = new zlm0(12);
                                    M.R(x11);
                                } else {
                                    izsVar25 = izsVar24;
                                }
                                izsVar26 = (izs) x11;
                            } else {
                                izsVar25 = izsVar24;
                                izsVar26 = izsVar9;
                            }
                            if (i15 != 0) {
                                Object x12 = M.x();
                                if (x12 == c0012a) {
                                    izsVar27 = izsVar26;
                                    x12 = new com.vk.movika.tools.controls.seekbar.o(8);
                                    M.R(x12);
                                } else {
                                    izsVar27 = izsVar26;
                                }
                                wzsVar4 = (wzs) x12;
                            } else {
                                izsVar27 = izsVar26;
                                wzsVar4 = wzsVar2;
                            }
                            if (i17 != 0) {
                                Object x13 = M.x();
                                if (x13 == c0012a) {
                                    wzsVar5 = wzsVar4;
                                    x13 = new dci(5);
                                    M.R(x13);
                                } else {
                                    wzsVar5 = wzsVar4;
                                }
                                yzs yzsVar4 = (yzs) x13;
                                izsVar15 = izsVar23;
                                izsVar28 = izsVar25;
                                yzsVar3 = yzsVar4;
                            } else {
                                wzsVar5 = wzsVar4;
                                izsVar15 = izsVar23;
                                izsVar28 = izsVar25;
                                yzsVar3 = yzsVar;
                            }
                            i20 = i3;
                            z7 = z3;
                            z8 = z4;
                            aVar6 = aVar5;
                            izsVar29 = izsVar27;
                            wzsVar6 = wzsVar5;
                            izsVar30 = izsVar36;
                            izsVar31 = izsVar22;
                        } else {
                            M.h();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            aVar6 = aVar;
                            izsVar31 = izsVar3;
                            izsVar21 = izsVar4;
                            izsVar14 = izsVar5;
                            izsVar15 = izsVar7;
                            izsVar28 = izsVar8;
                            yzsVar3 = yzsVar;
                            i20 = i3;
                            z7 = z3;
                            z8 = z4;
                            izsVar30 = izsVar6;
                            izsVar29 = izsVar9;
                            wzsVar6 = wzsVar2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            izsVar32 = izsVar29;
                            wzsVar7 = wzsVar6;
                            androidx.compose.runtime.b.f(-883206779, i20, i19, "com.vk.core.compose.video.VkAutoPlayVideo (VkAutoPlayVideo.kt:43)");
                        } else {
                            izsVar32 = izsVar29;
                            wzsVar7 = wzsVar6;
                        }
                        Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                        Object x14 = M.x();
                        if (x14 == c0012a) {
                            i21 = i20;
                            izsVar33 = izsVar28;
                            x14 = new VideoTextureView(context, null, 6, 0);
                            M.R(x14);
                        } else {
                            i21 = i20;
                            izsVar33 = izsVar28;
                        }
                        VideoTextureView videoTextureView3 = (VideoTextureView) x14;
                        boolean J = M.J(videoFile);
                        Object x15 = M.x();
                        if (J || x15 == c0012a) {
                            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                            x15 = b.C1208b.a().e(videoFile, null);
                            M.R(x15);
                        }
                        yg5 yg5Var2 = (yg5) x15;
                        wh50 c = androidx.compose.runtime.k.c(izsVar10, M, (i21 >> 15) & 14);
                        wh50 c2 = androidx.compose.runtime.k.c(izsVar11, M, (i21 >> 18) & 14);
                        wh50 c3 = androidx.compose.runtime.k.c(izsVar31, M, (i21 >> 21) & 14);
                        wh50 c4 = androidx.compose.runtime.k.c(izsVar21, M, (i21 >> 24) & 14);
                        wh50 c5 = androidx.compose.runtime.k.c(izsVar14, M, (i21 >> 27) & 14);
                        wh50 c6 = androidx.compose.runtime.k.c(izsVar30, M, 6);
                        wh50 c7 = androidx.compose.runtime.k.c(izsVar15, M, 6);
                        wh50 c8 = androidx.compose.runtime.k.c(wzsVar, M, (i19 >> 6) & 14);
                        izs izsVar38 = izsVar33;
                        wh50 c9 = androidx.compose.runtime.k.c(izsVar38, M, (i19 >> 9) & 14);
                        wzs wzsVar8 = wzsVar7;
                        wh50 c10 = androidx.compose.runtime.k.c(wzsVar8, M, (i19 >> 15) & 14);
                        wh50 c11 = androidx.compose.runtime.k.c(izsVar32, M, (i19 >> 12) & 14);
                        wh50 c12 = androidx.compose.runtime.k.c(yzsVar3, M, (i19 >> 18) & 14);
                        boolean J2 = M.J(yg5Var2);
                        Object x16 = M.x();
                        if (J2 || x16 == c0012a) {
                            x16 = new fdu0(videoTextureView3, c, c2, c3, c4, c5, c6, c7, c8, c9, c11, c10, c12);
                            videoTextureView = videoTextureView3;
                            M.R(x16);
                        } else {
                            videoTextureView = videoTextureView3;
                        }
                        fdu0 fdu0Var = (fdu0) x16;
                        boolean y2 = M.y(videoTextureView);
                        Object x17 = M.x();
                        if (y2 || x17 == c0012a) {
                            izsVar34 = izsVar31;
                            x17 = new j5b0(videoTextureView, 0);
                            M.R(x17);
                        } else {
                            izsVar34 = izsVar31;
                        }
                        ae2.a(i21 & 112, 4, M, (izs) x17, null, q630Var);
                        aVar3 = M;
                        boolean y3 = aVar3.y(yg5Var2) | aVar3.J(fdu0Var) | aVar3.y(videoTextureView);
                        int i30 = i21;
                        int i31 = (i30 & 896) ^ 384;
                        VideoTextureView videoTextureView4 = videoTextureView;
                        if (i31 > 256) {
                            aVar7 = aVar6;
                            if (aVar3.y(aVar7)) {
                                aVar8 = aVar7;
                                z9 = y3;
                                z10 = true;
                                z11 = z9 | z10;
                                x = aVar3.x();
                                if (!z11 || x == c0012a) {
                                    izsVar35 = izsVar30;
                                    x = new eb50(yg5Var2, fdu0Var, videoTextureView4, aVar8, 2);
                                    yg5Var = yg5Var2;
                                    videoTextureView2 = videoTextureView4;
                                    aVar9 = aVar8;
                                    aVar3.R(x);
                                } else {
                                    izsVar35 = izsVar30;
                                    yg5Var = yg5Var2;
                                    aVar9 = aVar8;
                                    videoTextureView2 = videoTextureView4;
                                }
                                izs izsVar39 = izsVar11;
                                bap.c(yg5Var, (izs) x, aVar3, 0);
                                y = ((i31 <= 256 && aVar3.y(aVar9)) || (i30 & 384) == 256) | aVar3.y(yg5Var);
                                x2 = aVar3.x();
                                if (!y || x2 == c0012a) {
                                    x2 = new ddu0(yg5Var, aVar9, null);
                                    aVar3.R(x2);
                                }
                                com.vk.libvideo.autoplay.a aVar10 = com.vk.libvideo.autoplay.a.t;
                                bap.f(aVar9, yg5Var, (wzs) x2, aVar3, 8 | ((i30 >> 6) & 14));
                                i22 = a.$EnumSwitchMapping$0[((Lifecycle.Event) s4z.a(((f5z) aVar3.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), aVar3).getValue()).ordinal()];
                                if (i22 == 1) {
                                    if (z8) {
                                        yg5Var.z0(videoTextureView2, aVar9, null);
                                        if (z7) {
                                            yg5Var.S(false);
                                        } else {
                                            yg5Var.play();
                                        }
                                    } else {
                                        yg5Var.G0(true);
                                        yg5Var.pause();
                                    }
                                    s3q0 s3q0Var = s3q0.a;
                                } else if (i22 != 2) {
                                    if (i22 == 3) {
                                        yg5Var.b0(videoTextureView2);
                                        yg5Var.pause();
                                    }
                                    s3q0 s3q0Var2 = s3q0.a;
                                } else {
                                    yg5Var.b0(videoTextureView2);
                                    yg5Var.pause();
                                    s3q0 s3q0Var3 = s3q0.a;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                z5 = z7;
                                z6 = z8;
                                aVar4 = aVar9;
                                izsVar13 = izsVar21;
                                wzsVar3 = wzsVar8;
                                izsVar16 = izsVar10;
                                yzsVar2 = yzsVar3;
                                izsVar19 = izsVar32;
                                izsVar12 = izsVar34;
                                izsVar11 = izsVar39;
                                izsVar18 = izsVar38;
                                izsVar17 = izsVar35;
                            }
                        } else {
                            aVar7 = aVar6;
                        }
                        aVar8 = aVar7;
                        z9 = y3;
                        if ((i30 & 384) != 256) {
                            z10 = false;
                            z11 = z9 | z10;
                            x = aVar3.x();
                            if (z11) {
                            }
                            izsVar35 = izsVar30;
                            x = new eb50(yg5Var2, fdu0Var, videoTextureView4, aVar8, 2);
                            yg5Var = yg5Var2;
                            videoTextureView2 = videoTextureView4;
                            aVar9 = aVar8;
                            aVar3.R(x);
                            izs izsVar392 = izsVar11;
                            bap.c(yg5Var, (izs) x, aVar3, 0);
                            y = ((i31 <= 256 && aVar3.y(aVar9)) || (i30 & 384) == 256) | aVar3.y(yg5Var);
                            x2 = aVar3.x();
                            if (!y) {
                            }
                            x2 = new ddu0(yg5Var, aVar9, null);
                            aVar3.R(x2);
                            com.vk.libvideo.autoplay.a aVar102 = com.vk.libvideo.autoplay.a.t;
                            bap.f(aVar9, yg5Var, (wzs) x2, aVar3, 8 | ((i30 >> 6) & 14));
                            i22 = a.$EnumSwitchMapping$0[((Lifecycle.Event) s4z.a(((f5z) aVar3.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), aVar3).getValue()).ordinal()];
                            if (i22 == 1) {
                            }
                            if (androidx.compose.runtime.b.d()) {
                            }
                            z5 = z7;
                            z6 = z8;
                            aVar4 = aVar9;
                            izsVar13 = izsVar21;
                            wzsVar3 = wzsVar8;
                            izsVar16 = izsVar10;
                            yzsVar2 = yzsVar3;
                            izsVar19 = izsVar32;
                            izsVar12 = izsVar34;
                            izsVar11 = izsVar392;
                            izsVar18 = izsVar38;
                            izsVar17 = izsVar35;
                        }
                        z10 = true;
                        z11 = z9 | z10;
                        x = aVar3.x();
                        if (z11) {
                        }
                        izsVar35 = izsVar30;
                        x = new eb50(yg5Var2, fdu0Var, videoTextureView4, aVar8, 2);
                        yg5Var = yg5Var2;
                        videoTextureView2 = videoTextureView4;
                        aVar9 = aVar8;
                        aVar3.R(x);
                        izs izsVar3922 = izsVar11;
                        bap.c(yg5Var, (izs) x, aVar3, 0);
                        y = ((i31 <= 256 && aVar3.y(aVar9)) || (i30 & 384) == 256) | aVar3.y(yg5Var);
                        x2 = aVar3.x();
                        if (!y) {
                        }
                        x2 = new ddu0(yg5Var, aVar9, null);
                        aVar3.R(x2);
                        com.vk.libvideo.autoplay.a aVar1022 = com.vk.libvideo.autoplay.a.t;
                        bap.f(aVar9, yg5Var, (wzs) x2, aVar3, 8 | ((i30 >> 6) & 14));
                        i22 = a.$EnumSwitchMapping$0[((Lifecycle.Event) s4z.a(((f5z) aVar3.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), aVar3).getValue()).ordinal()];
                        if (i22 == 1) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        z5 = z7;
                        z6 = z8;
                        aVar4 = aVar9;
                        izsVar13 = izsVar21;
                        wzsVar3 = wzsVar8;
                        izsVar16 = izsVar10;
                        yzsVar2 = yzsVar3;
                        izsVar19 = izsVar32;
                        izsVar12 = izsVar34;
                        izsVar11 = izsVar3922;
                        izsVar18 = izsVar38;
                        izsVar17 = izsVar35;
                    }
                    s = aVar3.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.cdu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i | 1);
                                gdu0.a(VideoFile.this, q630Var, aVar4, z5, z6, izsVar16, izsVar11, izsVar12, izsVar13, izsVar14, izsVar17, izsVar15, wzsVar, izsVar18, izsVar19, wzsVar3, yzsVar2, (androidx.compose.runtime.a) obj, I, i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i10 = i9;
                if (!M.y(wzsVar)) {
                }
                int i262 = 54 | i25;
                i11 = i2 & 8192;
                if (i11 == 0) {
                }
                i13 = i2 & 16384;
                if (i13 == 0) {
                }
                i15 = i2 & 32768;
                if (i15 == 0) {
                }
                i17 = i2 & 65536;
                if (i17 == 0) {
                }
                i19 = i18;
                if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (599187 & i19) != 599186)) {
                }
                s = aVar3.s();
                if (s == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i2 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            if (!M.y(wzsVar)) {
            }
            int i2622 = 54 | i25;
            i11 = i2 & 8192;
            if (i11 == 0) {
            }
            i13 = i2 & 16384;
            if (i13 == 0) {
            }
            i15 = i2 & 32768;
            if (i15 == 0) {
            }
            i17 = i2 & 65536;
            if (i17 == 0) {
            }
            i19 = i18;
            if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (599187 & i19) != 599186)) {
            }
            s = aVar3.s();
            if (s == null) {
            }
        }
        z3 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i2 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        if (!M.y(wzsVar)) {
        }
        int i26222 = 54 | i25;
        i11 = i2 & 8192;
        if (i11 == 0) {
        }
        i13 = i2 & 16384;
        if (i13 == 0) {
        }
        i15 = i2 & 32768;
        if (i15 == 0) {
        }
        i17 = i2 & 65536;
        if (i17 == 0) {
        }
        i19 = i18;
        if (M.t(i3 & 1, (i3 & 306783379) == 306783378 || (599187 & i19) != 599186)) {
        }
        s = aVar3.s();
        if (s == null) {
        }
    }
}
