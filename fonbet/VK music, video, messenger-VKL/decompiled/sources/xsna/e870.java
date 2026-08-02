package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.TypedValue;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.im.Image;
import com.vk.dto.push.FriendRequestInfo;
import com.vk.imageloader.ImageScreenSize;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: NotificationBuilder.kt */
/* loaded from: classes5.dex */
public final class e870 implements w8i {
    public static final e870 b = new e870();
    public static final bpn0 c = new bpn0(new pr6(23));
    public static final bpn0 d = new bpn0(new xu0(25));

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    public static com.vk.pushes.notifications.base.a a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public static io.reactivex.rxjava3.internal.operators.observable.m1 b(Context context, Map map) {
        String str;
        JSONObject optJSONObject;
        FriendRequestInfo.MutualFriends mutualFriends;
        String str2 = (String) map.get("type");
        if (str2 == null || !str2.equals("friend") || (str = (String) map.get("context")) == null || (optJSONObject = new JSONObject(str).optJSONObject("info")) == null) {
            return null;
        }
        Image image = new Image(optJSONObject.optJSONArray("photo"), null, 2, null);
        String optString = optJSONObject.optString("title");
        String optString2 = optJSONObject.optString("subtitle");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("mutual");
        if (optJSONObject2 != null) {
            String optString3 = optJSONObject2.optString("text");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = optJSONObject2.optJSONArray("images");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONArray optJSONArray2 = optJSONArray.optJSONArray(i);
                    if (optJSONArray2 != null) {
                        arrayList.add(new Image(optJSONArray2, null, 2, null));
                    }
                }
            }
            mutualFriends = new FriendRequestInfo.MutualFriends(optString3, arrayList);
        } else {
            mutualFriends = null;
        }
        FriendRequestInfo friendRequestInfo = new FriendRequestInfo(image, optString, optString2, mutualFriends);
        ArrayList arrayList2 = new ArrayList();
        Image image2 = friendRequestInfo.b;
        ImageSize Cb = image2 != null ? image2.Cb((int) context.getResources().getDimension(R.dimen.friend_request_photo_size), true, false) : null;
        ArrayList arrayList3 = new ArrayList();
        int dimension = (int) context.getResources().getDimension(R.dimen.friend_request_notification_mutual_photo);
        Bitmap a = uko.a(context, R.drawable.user_placeholder_system_theme, dimension, dimension);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.friend_request_notification_mutual_photo_overlap, typedValue, true);
        float f = typedValue.getFloat();
        if (Cb != null) {
            io.reactivex.rxjava3.core.q l = mcr0.l(-1L, Cb.d.d);
            asu0.a.getClass();
            arrayList2.add(l.r0(asu0.r()).c0(io.reactivex.rxjava3.core.q.T(a)));
        }
        FriendRequestInfo.MutualFriends mutualFriends2 = friendRequestInfo.e;
        Iterator it = (mutualFriends2 != null ? mutualFriends2.c : EmptyList.b).iterator();
        while (it.hasNext()) {
            ImageSize Cb2 = ((Image) it.next()).Cb(dimension, true, false);
            arrayList3.add(Cb2);
            if (Cb2 != null) {
                io.reactivex.rxjava3.core.q l2 = mcr0.l(-1L, Cb2.d.d);
                asu0.a.getClass();
                arrayList2.add(l2.r0(asu0.r()).c0(io.reactivex.rxjava3.core.q.T(a)));
            }
        }
        if (arrayList2.isEmpty()) {
            io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(new djs(context, map, null, null, friendRequestInfo));
            asu0.a.getClass();
            return T.a0(asu0.t());
        }
        io.reactivex.rxjava3.internal.operators.observable.e3 e3Var = new io.reactivex.rxjava3.internal.operators.observable.e3(null, arrayList2, new d810(new d870(Cb, arrayList3, a, context, dimension, f, map, friendRequestInfo), 8), io.reactivex.rxjava3.core.g.b);
        asu0.a.getClass();
        return e3Var.a0(asu0.t());
    }

    @ozl
    public static String c(Map map) {
        String str;
        String str2 = null;
        if (d().g()) {
            return null;
        }
        String str3 = (String) map.get("big_image");
        if (str3 != null) {
            Serializer.c<NotificationImage> cVar = NotificationImage.CREATOR;
            str = NotificationImage.a.a(new JSONArray(str3)).zb(1440, PublisherConfiguration.DEFAULT_MAX_RES);
        } else {
            str = null;
        }
        String str4 = (String) map.get("big_image_base");
        if (str4 != null) {
            m900<String, com.vk.dto.common.im.Image> m900Var = com.vk.dto.common.im.Image.g;
            com.vk.dto.common.im.Image image = (com.vk.dto.common.im.Image) ixj0.f(com.vk.dto.common.im.Image.zb(Image.a.b(new JSONObject(str4))), 1440, PublisherConfiguration.DEFAULT_MAX_RES);
            if (image != null) {
                str2 = image.d;
            }
        }
        return str2 == null ? str : str2;
    }

    public static v57 d() {
        return (v57) d.getValue();
    }

    public static String e(Map map) {
        String str;
        String str2 = null;
        if (d().g()) {
            return null;
        }
        String str3 = (String) map.get("image");
        if (str3 != null) {
            Serializer.c<NotificationImage> cVar = NotificationImage.CREATOR;
            str = NotificationImage.Db(NotificationImage.a.a(new JSONArray(str3)), ImageScreenSize.SIZE_56DP.h());
        } else {
            str = null;
        }
        int h = ImageScreenSize.SIZE_56DP.h();
        String a = cqm0.a((String) map.get("image_base"));
        if (a != null) {
            if (a.charAt(0) == '{') {
                try {
                    m900<String, com.vk.dto.common.im.Image> m900Var = com.vk.dto.common.im.Image.g;
                    com.vk.dto.common.im.Image image = (com.vk.dto.common.im.Image) ixj0.e(com.vk.dto.common.im.Image.zb(Image.a.b(new JSONObject(a))), h, true);
                    if (image != null) {
                        str2 = image.d;
                    }
                } catch (Throwable unused) {
                }
            }
            str2 = js5.a(h, a);
        }
        return str2 == null ? str : str2;
    }

    public static Bitmap f(String str) {
        if (d().g() || str == null) {
            return null;
        }
        return g(str, "community_channel", true);
    }

    public static Bitmap g(String str, String str2, boolean z) {
        Object obj;
        long j = z ? 600L : -1L;
        try {
            obj = (j5g.P(ule0.k, str2) ? mcr0.l(j, str) : mcr0.m(iah0.a(2), j, str)).a();
        } catch (Throwable unused) {
            obj = null;
        }
        return (Bitmap) obj;
    }

    public static String h(Integer num, Long l, Long l2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("conversation_message_id", num.intValue());
        jSONObject.put("sender_id", l.longValue());
        if (l2 != null) {
            jSONObject.put("chat_id", l2.longValue());
        }
        return jSONObject.toString();
    }

    public static boolean i(String str) {
        if (str.equals("unifyvideo_watch_later") || str.equals("unifyvideo_continue_watch")) {
            return true;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_NOTIFICATION_NEW_VIDEO;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures) && str.equals("unifyvideo_groups_publish")) {
            return true;
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_NOTIFICATION_LIVE;
        videoFeatures2.getClass();
        return bVar.a(videoFeatures2) && str.equals("unifylive");
    }
}
