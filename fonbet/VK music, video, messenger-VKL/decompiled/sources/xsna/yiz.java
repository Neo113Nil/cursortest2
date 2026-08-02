package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spannable;
import com.facebook.common.internal.ImmutableList;
import com.vk.api.generated.superApp.dto.SuperAppActiveFeatureDto;
import com.vk.api.generated.superApp.dto.SuperAppEditWidgetSettingsSourceDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.CommentDonut;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.newsfeed.activities.CommentsActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.media.pipeline.model.source.MediaSource;
import com.vk.media.pipeline.model.source.local.TrackMediaSource;
import com.vk.media.pipeline.model.source.picture.ImageFileMediaSource;
import com.vk.media.pipeline.model.timeline.AudioFragmentItem;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.timeline.VideoFragment;
import com.vk.toggle.features.FeedFeatures;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Triple;

/* compiled from: LiveDebugFileStorage.kt */
/* loaded from: classes3.dex */
public final class yiz implements gn60, id60, io.reactivex.rxjava3.functions.c {
    public static boolean c;
    public static volatile File d;
    public static final yiz b = new yiz();
    public static final String[] e = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_background", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "firebase_campaign"};
    public static final String[] f = {"ad_impression"};
    public static final String[] g = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_ab", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_cmp"};
    public static final String[] h = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static final void b(lpa0 lpa0Var, Context context, tjo tjoVar) {
        kj2 a = wkw.f().a();
        tjo a2 = a == null ? null : a.a();
        if (a2 != null) {
            fj2 fj2Var = new fj2(a2);
            if (tjoVar != null) {
                ImmutableList<tjo> immutableList = new ImmutableList<>(2);
                Collections.addAll(immutableList, tjoVar, fj2Var);
                lpa0Var.r = immutableList;
            } else {
                ImmutableList<tjo> immutableList2 = new ImmutableList<>(1);
                Collections.addAll(immutableList2, fj2Var);
                lpa0Var.r = immutableList2;
            }
        }
    }

    public static final void c(CharSequence charSequence, PostInteract postInteract) {
        if (charSequence instanceof Spannable) {
            qaz[] qazVarArr = (qaz[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), qaz.class);
            if (qazVarArr != null) {
                for (qaz qazVar : qazVarArr) {
                    qazVar.i = postInteract != null ? new com.vkontakte.android.data.c(postInteract) : null;
                }
            }
        }
    }

    public static final String d(List list) {
        return j5g.g0(list, null, null, null, 0, null, 63);
    }

    public static final ArrayList e(Timeline timeline) {
        List<VideoFragment> list = timeline.b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MediaSource t = ((VideoFragment) it.next()).b.t();
            Uri uri = t instanceof ImageFileMediaSource ? ((ImageFileMediaSource) t).b : t instanceof TrackMediaSource ? ((TrackMediaSource) t).b : null;
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        List<AudioFragmentItem> list2 = timeline.c.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((AudioFragmentItem) it2.next()).b.b.b);
        }
        return j5g.u0(arrayList2, arrayList);
    }

    public static final io.reactivex.rxjava3.core.w f(Executor executor) {
        ConcurrentHashMap<Executor, io.reactivex.rxjava3.core.w> concurrentHashMap = kwy.a;
        io.reactivex.rxjava3.core.w wVar = concurrentHashMap.get(executor);
        if (wVar != null) {
            return wVar;
        }
        synchronized (executor) {
            io.reactivex.rxjava3.core.w wVar2 = concurrentHashMap.get(executor);
            if (wVar2 != null) {
                return wVar2;
            }
            io.reactivex.rxjava3.core.w wVar3 = io.reactivex.rxjava3.schedulers.a.a;
            io.reactivex.rxjava3.internal.schedulers.d dVar = new io.reactivex.rxjava3.internal.schedulers.d(executor, true);
            concurrentHashMap.put(executor, dVar);
            s3q0 s3q0Var = s3q0.a;
            return dVar;
        }
    }

    public static final Object g(String str, Map map) {
        Object obj = map.get(str);
        return obj == null ? map.get(str.toLowerCase(Locale.ROOT)) : obj;
    }

    public static final List h(Object... objArr) {
        return rl3.u0(objArr);
    }

    public static io.reactivex.rxjava3.internal.operators.single.y i(String str, List list) {
        bpn0 bpn0Var = cqm0.a;
        if (str == null) {
            str = "";
        }
        int i = 12;
        return rsg0.w0(new aqe(list, str)).l(new ca6(new db(20), 7)).l(new mq(new oc0(i), i));
    }

    public static final void j(p3t p3tVar, t3t t3tVar) {
        p3tVar.ef(new w8q(t3tVar, 5));
        p3tVar.D4(new omf(t3tVar, 19));
        p3tVar.i9(new z0h(t3tVar, 14));
        p3tVar.yl(new wqf(t3tVar, 21));
    }

    public static final void k(ej90 ej90Var, PostInteract postInteract) {
        c(ej90Var.a, postInteract);
        c(ej90Var.b, postInteract);
    }

    public static final float n(float f2, gzs gzsVar) {
        return Math.abs(f2) <= Float.MAX_VALUE ? f2 : ((pco) gzsVar.invoke()).b;
    }

    public static final long o(float f2) {
        return byc0.b(f2, f2);
    }

    public static final ArrayList p(String str) {
        List c0 = drm0.c0(str, new String[]{", "}, 0, 6);
        ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            arrayList.add(drm0.p0((String) it.next()).toString());
        }
        return arrayList;
    }

    public static String r(String str) {
        return bbq.c(str, g, e);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        boolean z;
        CallEffectsDependency.DynamicLibsState dynamicLibsState = (CallEffectsDependency.DynamicLibsState) obj;
        if (((Boolean) obj2).booleanValue() && !dynamicLibsState.h()) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.s0.m.getClass();
            mqw0 mqw0Var = mqw0.a;
            if (Boolean.TRUE.booleanValue()) {
                z = true;
                return new VoipActionsFeatureState.c(z, dynamicLibsState.i());
            }
        }
        z = false;
        return new VoipActionsFeatureState.c(z, dynamicLibsState.i());
    }

    public tfx l(boolean z, List list, String str, SuperAppEditWidgetSettingsSourceDto superAppEditWidgetSettingsSourceDto) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("superApp.editWidgetSettings", new gsi0(3), new hsi0(3));
        tfxVar.j("enabled", z);
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((SuperAppActiveFeatureDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("active_features", arrayList);
        }
        if (str != null) {
            tfx.o(tfxVar, "widget_id", str, 0, 0, 12);
        }
        if (superAppEditWidgetSettingsSourceDto != null) {
            tfx.o(tfxVar, "source", superAppEditWidgetSettingsSourceDto.i(), 0, 0, 12);
        }
        return tfxVar;
    }

    public ufx m() {
        return new ufx("superApp.getSingleQueue", new koi0(6), new thl0(3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x003a, code lost:
    
        if (com.vk.toggle.b.A.a(r5) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List q(int i, Triple triple) {
        String str;
        String str2;
        List<Attachment> list;
        String str3;
        List<Attachment> list2;
        String string;
        String str4;
        StringBuilder sb;
        String str5;
        int i2;
        String str6;
        String str7;
        Post post = (Post) triple.d();
        CommentsActivity commentsActivity = (CommentsActivity) triple.g();
        Comment comment = (Comment) triple.h();
        Owner owner = commentsActivity != null ? commentsActivity.e.get(comment.c) : null;
        if (owner == null || !owner.i(512)) {
            FeedFeatures feedFeatures = FeedFeatures.FRIEND_COMMENTS_INLINE;
            feedFeatures.getClass();
        }
        String str8 = owner != null ? owner.d : null;
        if (str8 == null || str8.length() == 0) {
            if (owner != null) {
                str7 = owner.e;
            }
            str = null;
            int b2 = (str != null || drm0.N(str)) ? cn70.b(16) : cn70.b(8);
            str2 = comment.k;
            if (str2 != null || str2.length() == 0) {
                list = comment.j;
                if (list != null || list.isEmpty() || (list2 = comment.j) == null) {
                    str3 = null;
                    boolean z = owner == null && owner.i(4096);
                    sb = new StringBuilder();
                    str5 = owner != null ? owner.c : null;
                    if (owner == null && fkq0.d(owner.b) && (str6 = owner.m) != null && str6.length() != 0) {
                        sb.append(owner.m);
                    } else if (owner == null && fkq0.d(owner.b) && str5 != null && str5.length() != 0) {
                        int length = str5.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i2 = -1;
                                break;
                            }
                            if (ro.j(str5.charAt(i3))) {
                                i2 = i3;
                                break;
                            }
                            i3++;
                        }
                        if (i2 >= 0) {
                            sb.append((CharSequence) str5, 0, i2);
                        } else {
                            sb.append(str5);
                        }
                    } else if (str5 != null && str5.length() != 0) {
                        sb.append(str5);
                    }
                    String sb2 = sb.toString();
                    String str9 = comment.g;
                    ej90 ej90Var = comment.u;
                    CharSequence charSequence = ej90Var != null ? ej90Var.a : null;
                    CharSequence charSequence2 = ej90Var != null ? ej90Var.c : null;
                    CommentDonut commentDonut = comment.m;
                    return Collections.singletonList(new g0x(post, comment, owner, sb2, str9, b2, charSequence, charSequence2, str3, str, commentDonut == null && commentDonut.b, z, owner != null ? owner.f : null, i));
                }
                int i4 = com.vkontakte.android.attachments.a.a;
                int size = list2.size();
                if (size == 0) {
                    throw new IllegalStateException("atts is empty");
                }
                Attachment attachment = list2.get(0);
                if (size == 1) {
                    str4 = e43.a.getString(attachment.zb());
                } else {
                    int size2 = list2.size();
                    int Ab = list2.get(0).Ab();
                    if (Ab != -1) {
                        for (int i5 = 1; i5 < size2; i5++) {
                            if (Ab == list2.get(i5).Ab()) {
                            }
                        }
                        Resources resources = e43.a.getResources();
                        int Ab2 = attachment.Ab();
                        string = Ab2 == 0 ? resources.getQuantityString(R.plurals.num_attach_photo, size, Integer.valueOf(size)) : Ab2 == 1 ? resources.getQuantityString(R.plurals.num_attach_video, size, Integer.valueOf(size)) : Ab2 == 2 ? resources.getQuantityString(R.plurals.num_attach_audio, size, Integer.valueOf(size)) : Ab2 == 3 ? resources.getQuantityString(R.plurals.num_attach_document, size, Integer.valueOf(size)) : Ab2 == 8 ? resources.getQuantityString(R.plurals.num_attach_poll, size, Integer.valueOf(size)) : resources.getString(R.string.attachments);
                        str4 = string;
                    }
                    string = e43.a.getString(R.string.attachments);
                    str4 = string;
                }
            } else {
                str4 = comment.k;
            }
            str3 = str4;
            if (owner == null) {
            }
            sb = new StringBuilder();
            if (owner != null) {
            }
            if (owner == null) {
            }
            if (owner == null) {
            }
            if (str5 != null) {
                sb.append(str5);
            }
            String sb22 = sb.toString();
            String str92 = comment.g;
            ej90 ej90Var2 = comment.u;
            if (ej90Var2 != null) {
            }
            if (ej90Var2 != null) {
            }
            CommentDonut commentDonut2 = comment.m;
            return Collections.singletonList(new g0x(post, comment, owner, sb22, str92, b2, charSequence, charSequence2, str3, str, commentDonut2 == null && commentDonut2.b, z, owner != null ? owner.f : null, i));
        }
        str7 = js5.a(50, str8);
        str = str7;
        int b22 = (str != null || drm0.N(str)) ? cn70.b(16) : cn70.b(8);
        str2 = comment.k;
        if (str2 != null) {
        }
        list = comment.j;
        if (list != null) {
        }
        str3 = null;
        if (owner == null) {
        }
        sb = new StringBuilder();
        if (owner != null) {
        }
        if (owner == null) {
        }
        if (owner == null) {
        }
        if (str5 != null) {
        }
        String sb222 = sb.toString();
        String str922 = comment.g;
        ej90 ej90Var22 = comment.u;
        if (ej90Var22 != null) {
        }
        if (ej90Var22 != null) {
        }
        CommentDonut commentDonut22 = comment.m;
        return Collections.singletonList(new g0x(post, comment, owner, sb222, str922, b22, charSequence, charSequence2, str3, str, commentDonut22 == null && commentDonut22.b, z, owner != null ? owner.f : null, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return q(0, (Triple) pair);
    }

    @Override // xsna.id60
    public void a(UserId userId, boolean z) {
    }
}
