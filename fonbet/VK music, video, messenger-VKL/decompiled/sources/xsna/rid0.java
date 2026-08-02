package xsna;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.ecomm.design.view.productattaches.large.SnippetLiveStatus;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.vrv0;

/* compiled from: ProductAttachesLargeViewBinder.kt */
/* loaded from: classes18.dex */
public final class rid0 implements uid0 {
    public final Context a;
    public final ah5 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new n7w(this, 26));
    public final LinkedHashSet d = new LinkedHashSet();

    public rid0(Context context, ah5 ah5Var) {
        this.a = context;
        this.b = ah5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r12 != 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uid0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, tmc tmcVar, izs izsVar, nk0 nk0Var) {
        Iterator it;
        SnippetLiveStatus snippetLiveStatus;
        SnippetLiveStatus snippetLiveStatus2;
        omc omcVar;
        omc omcVar2;
        Pair pair;
        boolean z;
        String str;
        String str2;
        ProductVideoAttach.a aVar;
        boolean z2;
        String str3;
        String str4;
        Integer valueOf;
        k64 k64Var = tmcVar.f;
        List list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            pmc pmcVar = (pmc) next;
            if (pmcVar instanceof c5u) {
                c5u c5uVar = (c5u) pmcVar;
                boolean z3 = tmcVar.e;
                int i = k64Var.a;
                w530 w530Var = (w530) this.b.b;
                c530 c530Var = c5uVar.h;
                d5u d5uVar = c5uVar.d;
                boolean h = w530Var.a(c530Var).h();
                ProductVideoAttach.StatusType statusType = h ? ProductVideoAttach.StatusType.Adult : ProductVideoAttach.StatusType.Base;
                long j = c5uVar.a;
                Image image = c5uVar.g;
                if (image == null) {
                    image = null;
                }
                it = it2;
                Context context = this.a;
                if (h) {
                    z = z3;
                    boolean z4 = c530Var.b;
                    boolean z5 = c530Var.c;
                    if (z4) {
                        if (z5) {
                            valueOf = Integer.valueOf(R.string.product_tile_status_badge_blocked);
                            str = valueOf == null ? context.getString(valueOf.intValue()) : null;
                            if (str == null) {
                                str = d5uVar.c;
                                if (str == null || str.length() == 0) {
                                    str = null;
                                }
                                if (str == null) {
                                    str = d5uVar.a;
                                }
                            }
                        }
                        valueOf = null;
                        if (valueOf == null) {
                        }
                        if (str == null) {
                        }
                    } else {
                        if (!z5) {
                            valueOf = Integer.valueOf(R.string.product_tile_status_badge_for_adults);
                            if (valueOf == null) {
                            }
                            if (str == null) {
                            }
                        }
                        valueOf = null;
                        if (valueOf == null) {
                        }
                        if (str == null) {
                        }
                    }
                } else {
                    z = z3;
                    str = d5uVar.c;
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                    if (str == null) {
                        str = d5uVar.a;
                    }
                }
                if (h) {
                    str2 = str;
                } else {
                    int i2 = c5uVar.e;
                    str2 = str;
                    aVar = new ProductVideoAttach.a(i2);
                }
                aVar = null;
                String str5 = c5uVar.c;
                ProductVideoAttach.a aVar2 = aVar;
                if (!c530Var.b) {
                    if (c530Var.c) {
                        str5 = context.getString(R.string.product_tile_unavailable);
                    } else if (h) {
                        str5 = context.getString(R.string.product_tile_specify_age);
                    }
                }
                boolean z6 = c5uVar.f;
                p7u p7uVar = c5uVar.m;
                if (p7uVar != null) {
                    Float f = p7uVar.a;
                    if (f == null || f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z2 = z6;
                        str4 = null;
                    } else {
                        z2 = z6;
                        str4 = brm0.y(String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{f}, 1)), ".", StringUtils.COMMA);
                    }
                    str3 = str4;
                } else {
                    z2 = z6;
                    str3 = null;
                }
                omcVar2 = new vnd0(j, statusType, image, str2, aVar2, str5, z2, z, str3, i, context.getString(c5uVar.f ? R.string.product_clip_attach_action_service : R.string.product_clip_attach_action));
            } else {
                it = it2;
                if (pmcVar instanceof vrv0) {
                    vrv0 vrv0Var = (vrv0) pmcVar;
                    String str6 = vrv0Var.b;
                    vrv0.a aVar3 = vrv0Var.e;
                    StringBuilder sb = new StringBuilder();
                    String str7 = aVar3.c;
                    if (str7 != null) {
                        sb.append(str7);
                    }
                    String str8 = aVar3.d;
                    if (str8 != null) {
                        try {
                            LocalDateTime parse = LocalDateTime.parse(str8, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
                            pair = new Pair(String.valueOf(parse.getDayOfMonth()), parse.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()).substring(0, 3));
                        } catch (Exception e2) {
                            Log.e(rid0.class.getSimpleName(), "formatDateToDayMonth: " + e2.getMessage());
                            pair = null;
                        }
                        if (pair != null) {
                            sb.append(" · " + ((String) pair.d()) + ' ' + ((String) pair.g()));
                        }
                    }
                    omcVar = new urv0(k64Var.a, str6, sb.toString(), vrv0Var.c, tmcVar.e);
                } else {
                    if (!(pmcVar instanceof l20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l20 l20Var = (l20) pmcVar;
                    String str9 = l20Var.a;
                    String str10 = l20Var.b;
                    String str11 = l20Var.c;
                    Image image2 = l20Var.d;
                    String str12 = l20Var.e;
                    String str13 = (str12 == null || str12.length() <= 0) ? null : str12;
                    boolean z7 = tmcVar.e;
                    int i3 = k64Var.a;
                    boolean z8 = tmcVar.g;
                    SnippetLiveStatus.a aVar4 = SnippetLiveStatus.Companion;
                    String str14 = l20Var.g;
                    aVar4.getClass();
                    if (str14 != null) {
                        int hashCode = str14.hashCode();
                        if (hashCode != -2062291922) {
                            if (hashCode != -1497003419) {
                                if (hashCode == 483349263 && str14.equals("live_upcoming")) {
                                    snippetLiveStatus2 = SnippetLiveStatus.LIVE_UPCOMING;
                                    snippetLiveStatus = snippetLiveStatus2;
                                }
                            } else if (str14.equals("live_finished")) {
                                snippetLiveStatus2 = SnippetLiveStatus.LIVE_FINISHED;
                                snippetLiveStatus = snippetLiveStatus2;
                            }
                        } else if (str14.equals("live_started")) {
                            snippetLiveStatus2 = SnippetLiveStatus.LIVE_STARTED;
                            snippetLiveStatus = snippetLiveStatus2;
                        }
                        omcVar = new k20(str9, str10, str11, image2, str13, i3, z7, z8, snippetLiveStatus);
                    }
                    snippetLiveStatus = null;
                    omcVar = new k20(str9, str10, str11, image2, str13, i3, z7, z8, snippetLiveStatus);
                }
                omcVar2 = omcVar;
            }
            linkedHashMap.put(omcVar2, next);
            it2 = it;
        }
        List O0 = j5g.O0(linkedHashMap.keySet());
        float f2 = 0;
        ((tad) this.c.getValue()).a(O0, tmcVar.d, new j64(iah0.a(k64Var.a), iah0.a(k64Var.b), iah0.a(f2), iah0.a(f2)), new t35(linkedHashMap, izsVar, this, tmcVar, 2), new ue0(O0, linkedHashMap, this, kid0.a(tmcVar.c), tmcVar, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.uid0
    public final View b() {
        return (tad) this.c.getValue();
    }
}
