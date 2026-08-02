package xsna;

import com.vk.stat.scheme.CommonAudioStat$TypeNetworkAudioStallItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypePostingTimeline;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingRecognition;
import com.vk.stat.scheme.MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem;
import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import com.vk.stat.scheme.SchemeStat$EventProductMain;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.stat.scheme.SchemeStat$TypeInstallReferrer;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vk.stat.scheme.SchemeStat$TypeNetworkAudioItem;
import com.vk.stat.scheme.SchemeStat$TypeNetworkCommon;
import com.vk.stat.scheme.SchemeStat$TypeNetworkImagesItem;
import com.vk.stat.scheme.SchemeStat$TypeOpenWithUrl;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import xsna.yuo0;

/* compiled from: VkEventFilter.kt */
/* loaded from: classes11.dex */
public final class cru0 implements vyp {
    public static final Object j = msy.a(LazyThreadSafetyMode.NONE, new xa3(16));
    public final boolean b;
    public final apl c;
    public final HashSet<String> d;
    public boolean e;
    public zpu0 f;
    public long g;
    public long h;
    public long i;

    /* compiled from: VkEventFilter.kt */
    public static final class a {
        public static cru0 a() {
            vyp vypVar;
            epf epfVar = qsk0.a.n;
            if (epfVar != null) {
                vyp[] vypVarArr = (vyp[]) epfVar.b;
                int length = vypVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        vypVar = null;
                        break;
                    }
                    vypVar = vypVarArr[i];
                    if (vypVar instanceof cru0) {
                        break;
                    }
                    i++;
                }
                if (vypVar instanceof cru0) {
                    return (cru0) vypVar;
                }
            }
            return null;
        }

        public static boolean b() {
            cru0 a = a();
            if (a != null) {
                return a.d();
            }
            return false;
        }

        public static boolean c() {
            cru0 a = a();
            if (a != null) {
                return a.e();
            }
            return false;
        }
    }

    public cru0() {
        this(false, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if ((r7 instanceof com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fa, code lost:
    
        if (java.util.concurrent.ThreadLocalRandom.current().nextDouble() <= r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        if ((r6 instanceof com.vk.stat.scheme.CommonAudioStat$TypeAudioInputLagItem) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(rrk0 rrk0Var, boolean z) {
        boolean e;
        double doubleValue;
        SchemeStat$EventProductMain.Type type;
        boolean contains;
        if (!z) {
            boolean z2 = rrk0Var instanceof lrk0;
            if (!z2 || !s490.g((lrk0) rrk0Var)) {
                if (rrk0Var instanceof gsd0) {
                    HashSet<String> hashSet = this.d;
                    if (hashSet.isEmpty()) {
                        contains = true;
                    } else {
                        SchemeStat$EventProductMain.b bVar = ((gsd0) rrk0Var).b;
                        if (bVar instanceof SchemeStat$TypeNavgo) {
                            type = SchemeStat$EventProductMain.Type.TYPE_NAVGO;
                        } else if (bVar instanceof SchemeStat$TypeView) {
                            type = SchemeStat$EventProductMain.Type.TYPE_VIEW;
                        } else if (bVar instanceof SchemeStat$TypeClick) {
                            type = SchemeStat$EventProductMain.Type.TYPE_CLICK;
                        } else {
                            if (!(bVar instanceof SchemeStat$TypeAction)) {
                                throw new IllegalArgumentException("Type of " + bVar.getClass().getSimpleName() + " is unknown");
                            }
                            type = SchemeStat$EventProductMain.Type.TYPE_ACTION;
                        }
                        contains = hashSet.contains(type.name().toLowerCase(Locale.US));
                    }
                }
                if (rrk0Var instanceof qrk0) {
                    zpu0 zpu0Var = this.f;
                    zpu0Var.getClass();
                    SchemeStat$TypeDevNullItem schemeStat$TypeDevNullItem = ((qrk0) rrk0Var).a;
                    if (zpu0Var.a) {
                        Double d = zpu0Var.b.get(schemeStat$TypeDevNullItem.b());
                        if (d != null) {
                            doubleValue = d.doubleValue();
                        } else {
                            Double d2 = (Double) zpu0.d.get(schemeStat$TypeDevNullItem.b());
                            doubleValue = d2 != null ? d2.doubleValue() : zpu0Var.c;
                        }
                    }
                } else {
                    if (z2) {
                        SchemeStat$EventBenchmarkMain.b bVar2 = ((lrk0) rrk0Var).a;
                        if (bVar2 instanceof SchemeStat$TypeNetworkCommon) {
                            e = f();
                        } else if (bVar2 instanceof SchemeStat$TypeNetworkAudioItem) {
                            e = d();
                        } else if (bVar2 instanceof SchemeStat$TypeNetworkImagesItem) {
                            e = e();
                        } else if (!(bVar2 instanceof MobileOfficialAppsImStat$TypeImMessagingRecognition)) {
                            if (!(bVar2 instanceof MobileOfficialAppsFeedStat$TypeFeedLoadingTimeline)) {
                                if (!(bVar2 instanceof MobileOfficialAppsFeedStat$TypePostingTimeline)) {
                                    if (!(bVar2 instanceof MobileOfficialAppsMarusiaStat$TypeMarusiaPerformanceItem)) {
                                        if (!(bVar2 instanceof CommonAudioStat$TypeNetworkAudioStallItem)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    e = false;
                }
                if (e) {
                    return false;
                }
            }
            e = true;
            if (e) {
            }
        } else if (!(rrk0Var instanceof gsd0)) {
            if (rrk0Var instanceof lrk0) {
                SchemeStat$EventBenchmarkMain.b bVar3 = ((lrk0) rrk0Var).a;
                if (!(bVar3 instanceof SchemeStat$TypeOpenWithUrl)) {
                    if (!(bVar3 instanceof SchemeStat$TypeInstallReferrer)) {
                        if (!(bVar3 instanceof SchemeStat$TypeAppStarts)) {
                        }
                    }
                }
            }
            if (!(rrk0Var instanceof qrk0) || !((Set) j.getValue()).contains(((qrk0) rrk0Var).a.b())) {
                rrk0Var.toString();
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vyp
    public final boolean b() {
        return !f();
    }

    @Override // xsna.vyp
    public final boolean c() {
        return !this.d.isEmpty();
    }

    @Override // xsna.vyp
    public final void clear() {
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
    }

    public final boolean d() {
        if (this.b) {
            return false;
        }
        if (this.e) {
            return true;
        }
        if (this.i == 0) {
            return false;
        }
        apl aplVar = this.c;
        aplVar.getClass();
        if (yuo0.a.a(aplVar) < this.i) {
            return true;
        }
        this.i = 0L;
        return false;
    }

    public final boolean e() {
        if (this.e) {
            return true;
        }
        if (this.h == 0) {
            return false;
        }
        apl aplVar = this.c;
        aplVar.getClass();
        if (yuo0.a.a(aplVar) < this.h) {
            return true;
        }
        this.h = 0L;
        return false;
    }

    public final boolean f() {
        if (this.e) {
            return true;
        }
        if (this.g == 0) {
            return false;
        }
        apl aplVar = this.c;
        aplVar.getClass();
        if (yuo0.a.a(aplVar) < this.g) {
            return true;
        }
        this.g = 0L;
        return false;
    }

    public cru0(boolean z, int i) {
        ArrayList arrayList = new ArrayList();
        this.b = (i & 2) != 0 ? false : z;
        this.c = new apl();
        HashSet<String> hashSet = new HashSet<>();
        this.d = hashSet;
        this.f = new zpu0(1.0d, jgp.b, false);
        hashSet.addAll(arrayList);
        clear();
    }
}
