package xsna;

import androidx.annotation.NonNull;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutOrientation;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.internal.measurement.zzoo;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.newsfeed.entries.post.DonutBadgeInfo;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: LoginButtonTransformer.kt */
@vby
/* loaded from: classes16.dex */
public final class m200 implements yip, q701, gn60 {
    public static volatile wxo c;
    public static final m200 b = new m200();
    public static final double[][] d = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] e = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] f = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] g = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final s1v h = new s1v();
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static final /* synthetic */ m200 k = new m200();

    public m200(tgl0 tgl0Var) {
        new sgl0("edu_organization", m6p.class);
        int i2 = tgl0Var.a().getInt("edu_organization_storage_version", 0);
        while (i2 < 1) {
            i2++;
            tgl0Var.a().putInt("edu_organization_storage_version", i2);
        }
    }

    public static final x6p0 A(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-455350537, 0, -1, "com.vk.core.compose.component.topbar.rememberTopAppBarState (TopAppBarScrollBehavior.kt:468)");
        }
        Object[] objArr = new Object[0];
        fh9 fh9Var = x6p0.d;
        boolean n = aVar.n(-3.4028235E38f) | aVar.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) | aVar.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Object x = aVar.x();
        if (n || x == a.C0011a.a) {
            x = new com.vk.movika.sdk.base.logic.interactor.m(29);
            aVar.R(x);
        }
        x6p0 x6p0Var = (x6p0) crx0.D(objArr, fh9Var, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return x6p0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a8, code lost:
    
        if (xsna.nkn0.d(r10, r11, false, r3, r5) == r13) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(x6p0 x6p0Var, float f2, float f3, l7l l7lVar, iq2 iq2Var, ContinuationImpl continuationImpl) {
        w6p0 w6p0Var;
        w6p0 w6p0Var2;
        CoroutineSingletons coroutineSingletons;
        int i2;
        Ref$FloatRef ref$FloatRef;
        iq2 iq2Var2;
        kq2 a;
        Float f4;
        jan0 jan0Var;
        Ref$FloatRef ref$FloatRef2;
        if (continuationImpl instanceof w6p0) {
            w6p0Var = (w6p0) continuationImpl;
            int i3 = w6p0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6p0Var.label = i3 - Integer.MIN_VALUE;
                w6p0Var2 = w6p0Var;
                Object obj = w6p0Var2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = w6p0Var2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    if (x6p0Var.a() < 0.01f || x6p0Var.a() == 1.0f) {
                        return new jmr0(0L);
                    }
                    ref$FloatRef = new Ref$FloatRef();
                    ref$FloatRef.element = f3;
                    if (l7lVar != null && Math.abs(f3) > 1.0f) {
                        Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        kq2 a2 = s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 28);
                        m0i m0iVar = new m0i(ref$FloatRef3, x6p0Var, ref$FloatRef, 7);
                        w6p0Var2.L$0 = x6p0Var;
                        w6p0Var2.L$1 = iq2Var;
                        w6p0Var2.L$2 = ref$FloatRef;
                        w6p0Var2.label = 2;
                    }
                } else {
                    if (i2 == 1) {
                        float f5 = w6p0Var2.F$0;
                        kotlin.a.a(obj);
                        return new jmr0(b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5));
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$FloatRef2 = (Ref$FloatRef) w6p0Var2.L$0;
                        kotlin.a.a(obj);
                        ref$FloatRef = ref$FloatRef2;
                        return new jmr0(b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ref$FloatRef.element));
                    }
                    Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) w6p0Var2.L$2;
                    iq2Var = (iq2) w6p0Var2.L$1;
                    x6p0 x6p0Var2 = (x6p0) w6p0Var2.L$0;
                    kotlin.a.a(obj);
                    ref$FloatRef = ref$FloatRef4;
                    x6p0Var = x6p0Var2;
                }
                iq2Var2 = iq2Var;
                if (iq2Var2 != null && x6p0Var.b() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x6p0Var.b() > x6p0Var.c()) {
                    a = s1v.a(x6p0Var.b(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    f4 = new Float(x6p0Var.a() >= 0.5f ? 0.0f : x6p0Var.c());
                    jan0Var = new jan0(x6p0Var, 3);
                    w6p0Var2.L$0 = ref$FloatRef;
                    w6p0Var2.L$1 = null;
                    w6p0Var2.L$2 = null;
                    w6p0Var2.label = 3;
                    if (nkn0.f(a, f4, iq2Var2, false, jan0Var, w6p0Var2, 4) != coroutineSingletons) {
                        ref$FloatRef2 = ref$FloatRef;
                        ref$FloatRef = ref$FloatRef2;
                    }
                    return coroutineSingletons;
                }
                return new jmr0(b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ref$FloatRef.element));
            }
        }
        w6p0Var = new w6p0(continuationImpl);
        w6p0Var2 = w6p0Var;
        Object obj2 = w6p0Var2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = w6p0Var2.label;
        if (i2 != 0) {
        }
        iq2Var2 = iq2Var;
        if (iq2Var2 != null) {
            a = s1v.a(x6p0Var.b(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
            f4 = new Float(x6p0Var.a() >= 0.5f ? 0.0f : x6p0Var.c());
            jan0Var = new jan0(x6p0Var, 3);
            w6p0Var2.L$0 = ref$FloatRef;
            w6p0Var2.L$1 = null;
            w6p0Var2.L$2 = null;
            w6p0Var2.label = 3;
            if (nkn0.f(a, f4, iq2Var2, false, jan0Var, w6p0Var2, 4) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return new jmr0(b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ref$FloatRef.element));
    }

    public static final void C(IllegalStateException illegalStateException) {
        par0.a.getClass();
        par0.d(illegalStateException);
    }

    public static final long D(long j2, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? s6j.a(o6j.k(j2), o6j.i(j2), o6j.j(j2), o6j.h(j2)) : s6j.a(o6j.j(j2), o6j.h(j2), o6j.k(j2), o6j.i(j2));
    }

    public static double F(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final q630 G(q630 q630Var, IntrinsicSize intrinsicSize) {
        return q630Var.g(new cpx(intrinsicSize, a5x.a));
    }

    public static final sdi a() {
        return new sdi();
    }

    public static final long b(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void c(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static boolean d(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final boolean e(euk0 euk0Var, int i2, c0a0 c0a0Var, boolean z) {
        boolean z2;
        synchronized (i) {
            try {
                int i3 = euk0Var.d;
                if (i3 == i2) {
                    euk0Var.c = c0a0Var;
                    z2 = true;
                    if (z) {
                        euk0Var.e++;
                    }
                    euk0Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static double f(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1 : d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static long g(long j2, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return s6j.a(layoutOrientation == layoutOrientation2 ? o6j.k(j2) : o6j.j(j2), layoutOrientation == layoutOrientation2 ? o6j.i(j2) : o6j.h(j2), layoutOrientation == layoutOrientation2 ? o6j.j(j2) : o6j.k(j2), layoutOrientation == layoutOrientation2 ? o6j.h(j2) : o6j.i(j2));
    }

    public static long i(int i2, long j2) {
        return s6j.a(0, o6j.i(j2), (i2 & 4) != 0 ? o6j.j(j2) : 0, o6j.h(j2));
    }

    public static lg90 k(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1869183844, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
        }
        lg90 b2 = or.b(aVar, -604730424, R.drawable.vk_icon_add_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 m(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
        }
        lg90 b2 = or.b(aVar, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 n(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(80869148, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDownOutline28> (VkSdkIcons.kt:430)");
        }
        lg90 b2 = or.b(aVar, -303682241, R.drawable.vk_icon_chevron_down_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 o(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1131013412, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite36> (VkSdkIcons.kt:860)");
        }
        lg90 b2 = or.b(aVar, -1949301, R.drawable.vk_icon_favorite_36, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 p(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1717878368, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SearchOutline28> (VkSdkIcons.kt:3020)");
        }
        lg90 b2 = or.b(aVar, 1516014657, R.drawable.vk_icon_search_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 q(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-585171788, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ServicesOutline28> (VkSdkIcons.kt:3288)");
        }
        lg90 b2 = or.b(aVar, 419696811, R.drawable.vk_icon_services_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 r(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2048237034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SettingsOutline28> (VkSdkIcons.kt:3322)");
        }
        lg90 b2 = or.b(aVar, 429284277, R.drawable.vk_icon_settings_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static lg90 s(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(328482204, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ShareOutline28> (VkSdkIcons.kt:3340)");
        }
        lg90 b2 = or.b(aVar, 1878014662, R.drawable.vk_icon_share_outline_28, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b2;
    }

    public static final int t(SnapshotStateList snapshotStateList) {
        return ((euk0) qak0.h(snapshotStateList.b)).e;
    }

    public static final q630 u(q630 q630Var, IntrinsicSize intrinsicSize) {
        return q630Var.g(new xox(intrinsicSize, a5x.a));
    }

    public static double v(double[] dArr) {
        double[] C = fdi.C(dArr, d);
        double f2 = f(C[0]);
        double f3 = f(C[1]);
        double f4 = f(C[2]);
        return Math.atan2(((f2 + f3) - (f4 * 2.0d)) / 9.0d, ((((-12.0d) * f3) + (f2 * 11.0d)) + f4) / 11.0d);
    }

    public static double w(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1 : d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 0 : 1);
    }

    public static boolean y(double d2) {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE <= d2 && d2 <= 100.0d;
    }

    public static final boolean z(SnapshotStateList snapshotStateList, izs izsVar) {
        int i2;
        c0a0<? extends T> c0a0Var;
        Object invoke;
        dak0 j2;
        boolean e2;
        do {
            synchronized (i) {
                euk0 euk0Var = (euk0) qak0.h(snapshotStateList.b);
                i2 = euk0Var.d;
                c0a0Var = euk0Var.c;
                s3q0 s3q0Var = s3q0.a;
            }
            e1a0 builder = c0a0Var.builder();
            invoke = izsVar.invoke(builder);
            c0a0 d2 = builder.d();
            if (epx.f(d2, c0a0Var)) {
                break;
            }
            euk0 euk0Var2 = snapshotStateList.b;
            synchronized (qak0.c) {
                j2 = qak0.j();
                e2 = e((euk0) qak0.w(euk0Var2, snapshotStateList, j2), i2, d2, true);
            }
            qak0.n(j2, snapshotStateList);
        } while (!e2);
        return ((Boolean) invoke).booleanValue();
    }

    public List E(DonutBadgeInfo donutBadgeInfo) {
        return Collections.singletonList(new b1o(donutBadgeInfo.b));
    }

    @Override // xsna.yip
    public boolean h(@NonNull Object obj, @NonNull File file, @NonNull au80 au80Var) {
        try {
            du8.d(file, (ByteBuffer) obj);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public wxo l(SwitcherUiMode switcherUiMode, com.vk.superapp.multiaccount.api.a aVar, com.vk.superapp.multiaccount.api.d dVar, com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c cVar) {
        wxo wxoVar = c;
        if (wxoVar != null) {
            return wxoVar;
        }
        synchronized (this) {
            wxo wxoVar2 = c;
            if (wxoVar2 != null) {
                return wxoVar2;
            }
            wxo wxoVar3 = new wxo(aVar, new vxo(dVar, switcherUiMode), cVar, switcherUiMode);
            c = wxoVar3;
            return wxoVar3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return E((DonutBadgeInfo) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzoo.zzc());
    }

    public m200() {
    }
}
