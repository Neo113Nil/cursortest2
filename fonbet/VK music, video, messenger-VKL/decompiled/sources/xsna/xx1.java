package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.internal.measurement.zznw;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesContactDto;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.permission.PermissionHelper;
import com.vk.voip.userid.CallsUserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.rustore.sdk.activitylauncher.CallbackResultReceiver;
import ru.rustore.sdk.activitylauncher.RuStoreActivityLauncher;
import xsna.kr5;
import xsna.ldj0;

/* compiled from: AnalyticsEventProvider.kt */
/* loaded from: classes9.dex */
public final class xx1 implements q701, vv60 {
    public static final xx1 c = new xx1(1);
    public static final /* synthetic */ xx1 d = new xx1(5);
    public static final /* synthetic */ xx1 e = new xx1(6);
    public final /* synthetic */ int b;

    public /* synthetic */ xx1(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.content.ServiceConnection, xsna.fy1] */
    public static void A(Context context, String str, be beVar) {
        String Q = beVar.Q();
        Map P = beVar.P();
        if (inj.a(context, "ru.vk.store.qa") || inj.a(context, "ru.vk.store")) {
            Intent intent = new Intent("ru.vk.store.provider.analytics.RemoteAnalyticsProvider");
            ComponentName k = atv0.k(context.getPackageManager().queryIntentServices(intent, 0));
            if (k == null) {
                return;
            }
            intent.setComponent(k);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? fy1Var = new fy1(str, Q, P, new vx1(context, ref$ObjectRef), new wx1(context, ref$ObjectRef));
            ref$ObjectRef.element = fy1Var;
            try {
                context.bindService(intent, (ServiceConnection) fy1Var, 1);
            } catch (SecurityException e2) {
                Log.e("AnalyticsEventProvider", "postAnalyticsEvent", e2);
            }
        }
    }

    public static final void B(SparseArray sparseArray, SparseArray sparseArray2) {
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
        }
    }

    public static final llr0 C(final yk2 yk2Var, final boolean z, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1724527265, i, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter (AnimatedVectorPainterResources.android.kt:45)");
        }
        int i2 = (i & 112) | (i & 14) | 384;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1209674880, i2, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter (AnimatedVectorPainterResources.android.kt:57)");
        }
        imw imwVar = yk2Var.a;
        llr0 g = mlr0.g(imwVar.b, imwVar.c, imwVar.d, imwVar.e, imwVar.a, imwVar.g, imwVar.h, true, kai.c(-1895266590, new zzs() { // from class: xsna.hm2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                jai jaiVar = jgz.d;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1895266590, intValue, -1, "androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter.<anonymous> (AnimatedVectorPainterResources.android.kt:68)");
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    yk2 yk2Var2 = yk2Var;
                    wlp0<Boolean> e2 = ump0.e(valueOf, yk2Var2.a.a, aVar2, 0, 0);
                    ph50 b = h5h0.b();
                    aVar2.K(-285052463);
                    ArrayList arrayList = yk2Var2.b;
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        jm2 jm2Var = (jm2) arrayList.get(i3);
                        ar2 ar2Var = jm2Var.b;
                        String str = jm2Var.a;
                        int i4 = yk2Var2.c;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(839519568, 0, -1, "androidx.compose.animation.graphics.vector.Animator.createVectorConfig (Animator.kt:57)");
                        }
                        aVar2.K(-675540879);
                        Object x = aVar2.x();
                        if (x == a.C0011a.a) {
                            x = new uuk0();
                            aVar2.R(x);
                        }
                        uuk0 uuk0Var = (uuk0) x;
                        ar2Var.a(e2, uuk0Var, i4, aVar2, 0);
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        uuk0 uuk0Var2 = (uuk0) b.d(str);
                        if (uuk0Var2 != null) {
                            mtk0<Float> mtk0Var = uuk0Var.a;
                            if (mtk0Var != null) {
                                uuk0Var2.a = mtk0Var;
                            }
                            mtk0<Float> mtk0Var2 = uuk0Var.b;
                            if (mtk0Var2 != null) {
                                uuk0Var2.b = mtk0Var2;
                            }
                            mtk0<Float> mtk0Var3 = uuk0Var.c;
                            if (mtk0Var3 != null) {
                                uuk0Var2.c = mtk0Var3;
                            }
                            mtk0<Float> mtk0Var4 = uuk0Var.d;
                            if (mtk0Var4 != null) {
                                uuk0Var2.d = mtk0Var4;
                            }
                            mtk0<Float> mtk0Var5 = uuk0Var.e;
                            if (mtk0Var5 != null) {
                                uuk0Var2.e = mtk0Var5;
                            }
                            mtk0<Float> mtk0Var6 = uuk0Var.f;
                            if (mtk0Var6 != null) {
                                uuk0Var2.f = mtk0Var6;
                            }
                            mtk0<Float> mtk0Var7 = uuk0Var.g;
                            if (mtk0Var7 != null) {
                                uuk0Var2.g = mtk0Var7;
                            }
                            mtk0<? extends List<? extends qq90>> mtk0Var8 = uuk0Var.h;
                            if (mtk0Var8 != null) {
                                uuk0Var2.h = mtk0Var8;
                            }
                            mtk0<l5g> mtk0Var9 = uuk0Var.i;
                            if (mtk0Var9 != null) {
                                uuk0Var2.i = mtk0Var9;
                            }
                            mtk0<l5g> mtk0Var10 = uuk0Var.j;
                            if (mtk0Var10 != null) {
                                uuk0Var2.j = mtk0Var10;
                            }
                            mtk0<Float> mtk0Var11 = uuk0Var.k;
                            if (mtk0Var11 != null) {
                                uuk0Var2.k = mtk0Var11;
                            }
                            mtk0<Float> mtk0Var12 = uuk0Var.l;
                            if (mtk0Var12 != null) {
                                uuk0Var2.l = mtk0Var12;
                            }
                            mtk0<Float> mtk0Var13 = uuk0Var.m;
                            if (mtk0Var13 != null) {
                                uuk0Var2.m = mtk0Var13;
                            }
                            mtk0<Float> mtk0Var14 = uuk0Var.n;
                            if (mtk0Var14 != null) {
                                uuk0Var2.n = mtk0Var14;
                            }
                            mtk0<Float> mtk0Var15 = uuk0Var.o;
                            if (mtk0Var15 != null) {
                                uuk0Var2.o = mtk0Var15;
                            }
                            mtk0<Float> mtk0Var16 = uuk0Var.p;
                            if (mtk0Var16 != null) {
                                uuk0Var2.p = mtk0Var16;
                            }
                        } else {
                            b.p(str, uuk0Var);
                        }
                    }
                    aVar2.j();
                    jaiVar.invoke(yk2Var2.a.f, new um00(b), aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }, aVar), aVar, 113246208, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g;
    }

    public static final jdj0 D(ldj0 ldj0Var, tjv0 tjv0Var, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            tjv0Var = (tjv0) aVar.r(ujv0.b);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(583775415, i, -1, "com.vk.core.compose.shimmer.rememberShimmer (Shimmer.kt:13)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-318413104, 8, -1, "com.vk.core.compose.shimmer.rememberShimmerEffect (ShimmerEffect.kt:22)");
        }
        float I0 = ((azl) aVar.r(uvi.h)).I0(tjv0Var.f);
        boolean J = aVar.J(tjv0Var);
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (J || x == obj) {
            Object odj0Var = new odj0(tjv0Var.a, tjv0Var.b, tjv0Var.c, tjv0Var.d, tjv0Var.e, I0);
            aVar.R(odj0Var);
            x = odj0Var;
        }
        odj0 odj0Var2 = (odj0) x;
        boolean y = aVar.y(odj0Var2);
        Object x2 = aVar.x();
        Object obj2 = null;
        if (y || x2 == obj) {
            x2 = new pdj0(odj0Var2, null);
            aVar.R(x2);
        }
        boolean z = false;
        bap.g(odj0Var2, (wzs) x2, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        int i3 = i & 14;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1297818425, i3, -1, "com.vk.core.compose.shimmer.rememberShimmerBounds (ShimmerBounds.kt:10)");
        }
        boolean J2 = (((i3 ^ 6) > 4 && aVar.J(ldj0Var)) || (i & 6) == 4) | aVar.J(((Context) aVar.r(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics());
        Object x3 = aVar.x();
        if (J2 || x3 == obj) {
            if (ldj0Var.equals(ldj0.c.a)) {
                obj2 = new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r0.widthPixels, r0.heightPixels);
            } else if (ldj0Var.equals(ldj0.a.a)) {
                obj2 = zhf0.e;
            } else if (!ldj0Var.equals(ldj0.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.R(obj2);
            x3 = obj2;
        }
        zhf0 zhf0Var = (zhf0) x3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (((i & 112) ^ 48) > 32 && aVar.J(tjv0Var)) {
            z = true;
        }
        boolean J3 = aVar.J(odj0Var2) | z | aVar.J(zhf0Var);
        Object x4 = aVar.x();
        if (J3 || x4 == obj) {
            x4 = new jdj0(tjv0Var, odj0Var2, zhf0Var);
            aVar.R(x4);
        }
        jdj0 jdj0Var = (jdj0) x4;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return jdj0Var;
    }

    public static Object E(Context context, SuspendLambda suspendLambda) {
        boolean z;
        if (!gz80.a(29)) {
            return Boolean.TRUE;
        }
        Context context2 = context;
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        if (((FragmentActivity) (((FragmentActivity) (!z ? null : context2)) != null ? (Activity) context2 : null)) == null) {
            return Boolean.FALSE;
        }
        nm8 a = w0b.a(0, null, null, 6);
        PermissionHelper.a.k(context, new String[]{"android.permission.ACTIVITY_RECOGNITION"}, R.string.vk_permissions_vkrun_activity_recognition, new jds0(a, 7), new dso0(a, 20));
        return a.a(suspendLambda);
    }

    @SuppressLint({"CheckResult"})
    public static final void F() {
        rsg0.T(yfb.x(new zq70().J(null, null, null))).subscribe(new afs(new bqt(25), 24));
    }

    public static final String G(Playlist playlist) {
        String str;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(a0a.d);
        sb.append("/music?z=audio_playlist");
        sb.append(playlist.c);
        sb.append('_');
        sb.append(playlist.b);
        String str2 = playlist.x;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = DomExceptionUtils.SEPARATOR + playlist.x;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.q a(final cse0 cse0Var, final dre0 dre0Var, final gzs gzsVar, final z7w z7wVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new io.reactivex.rxjava3.core.s() { // from class: xsna.wre0
            @Override // io.reactivex.rxjava3.core.s
            public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
                rVar.a(new xre0(vre0.e(cse0.this, dre0Var, null, gzsVar, new i750(rVar, 22), null, new ece0(1, z7wVar, rVar), 36), 0));
            }
        });
    }

    public static final boolean b(Playlist playlist) {
        PlaylistPermissions playlistPermissions;
        if (!playlist.Fb()) {
            if (((jnj.f(playlist.O) || (playlistPermissions = playlist.B) == null) ? false : playlistPermissions.d) && !o25.a().a(playlist.c) && playlist.g == null) {
                if (playlist.f != null) {
                    return !o25.a().a(r3.c);
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean d(Playlist playlist) {
        PlaylistPermissions playlistPermissions = playlist.B;
        return ((playlistPermissions != null ? playlistPermissions.g : false) && e(playlist)) || v(playlist);
    }

    public static final boolean e(Playlist playlist) {
        PlaylistPermissions playlistPermissions = playlist.B;
        return (playlistPermissions != null ? playlistPermissions.c : false) && (w(playlist) || u(playlist) || xg5.a().d(playlist.c));
    }

    public static final Playlist f(Playlist playlist) {
        return Playlist.zb(playlist, null, null, null, null, -1, 255);
    }

    public static final void g(Matrix matrix, SizeF sizeF, float f, SizeF sizeF2, boolean z) {
        float height;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            float width = sizeF2.getWidth();
            float height2 = sizeF2.getHeight();
            float width2 = sizeF.getWidth() / width;
            float height3 = sizeF.getHeight() / height2;
            if (height3 <= width2) {
                f2 = pm0.a(width, height3, sizeF.getWidth(), 0.5f);
                width2 = height3;
            } else {
                f += (sizeF.getHeight() - (height2 * width2)) * 0.5f;
            }
            matrix.setScale(width2, width2);
            matrix.postTranslate(f2 + 0.5f, f + 0.5f);
            return;
        }
        float width3 = sizeF2.getWidth();
        float height4 = sizeF2.getHeight();
        float width4 = sizeF.getWidth() / width3;
        float height5 = sizeF.getHeight() / height4;
        if (height5 > width4) {
            f2 = pm0.a(width3, height5, sizeF.getWidth(), 0.5f);
            height = f;
            width4 = height5;
        } else {
            height = ((sizeF.getHeight() - (height4 * width4)) * 0.5f) + f;
        }
        matrix.setScale(width4, width4);
        matrix.postTranslate(f2 + 0.5f, (f * 0.5f) + height + 0.5f);
    }

    public static jar0 h(Bitmap bitmap) {
        return new jar0(znk0.k(bitmap));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.voip.userid.CallsUserId$ContactId] */
    public static LinkedHashMap i(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = EmptyList.b;
        }
        for (MessagesContactDto messagesContactDto : list) {
            String d2 = messagesContactDto.d();
            if (d2 != null) {
                Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                Long n = arm0.n(d2);
                CallsUserId.VkUserId contactId = n == null ? new CallsUserId.ContactId(d2) : new CallsUserId.VkUserId(new UserId(n.longValue()));
                Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                ImageList a = ImageList.a.a(messagesContactDto.i());
                String d3 = messagesContactDto.d();
                if (d3 == null) {
                    throw new IllegalStateException("Contact without callsId: " + messagesContactDto);
                }
                Long n2 = arm0.n(d3);
                linkedHashMap.put(contactId, new t49(n2 == null ? new CallsUserId.ContactId(d3) : new CallsUserId.VkUserId(new UserId(n2.longValue())), messagesContactDto.getId(), messagesContactDto.g(), a, new kr5((AvatarBorderType) null, (h2z) (false ? 1 : 0), (izs) new l00(a, 12), 7)));
            }
        }
        return linkedHashMap;
    }

    public static final int j(Playlist playlist) {
        return playlist.O;
    }

    public static final Playlist k(Playlist playlist) {
        o25.a().c();
        return playlist.Ab();
    }

    public static LinkedHashMap l(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list == null) {
            list = EmptyList.b;
        }
        for (GroupsGroupFullDto groupsGroupFullDto : list) {
            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
            CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(fkq0.e(groupsGroupFullDto.P0()));
            UserId P0 = groupsGroupFullDto.P0();
            if (P0 == null) {
                throw new IllegalStateException("Group without id: " + groupsGroupFullDto);
            }
            CallsUserId.VkUserId vkUserId2 = new CallsUserId.VkUserId(fkq0.e(P0));
            String y1 = groupsGroupFullDto.y1();
            if (y1 == null) {
                y1 = "";
            }
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            ImageList a = ImageList.a.a(groupsGroupFullDto.V1());
            kr5.a aVar = new kr5.a(new pp5(ImageList.a.a(groupsGroupFullDto.V1()), groupsGroupFullDto.R1()));
            s3q0 s3q0Var = s3q0.a;
            linkedHashMap.put(vkUserId, new w49(vkUserId2, y1, a, aVar.a()));
        }
        return linkedHashMap;
    }

    public static final Playlist m(Playlist playlist) {
        return playlist.Bb(o25.a().c());
    }

    public static LinkedHashMap n(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (UsersUserFullDto usersUserFullDto : list == null ? EmptyList.b : list) {
            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
            CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(usersUserFullDto.s1());
            UserId s1 = usersUserFullDto.s1();
            if (s1 == null) {
                throw new IllegalStateException("User without id: " + usersUserFullDto);
            }
            CallsUserId.VkUserId vkUserId2 = new CallsUserId.VkUserId(s1);
            String D0 = usersUserFullDto.D0();
            String str = D0 == null ? "" : D0;
            String x1 = usersUserFullDto.x1();
            String str2 = x1 == null ? "" : x1;
            Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
            ImageList a = ImageList.a.a(usersUserFullDto.r2());
            UsersOnlineInfoDto U1 = usersUserFullDto.U1();
            linkedHashMap.put(vkUserId, new z49(vkUserId2, str, str2, a, U1 == null ? new UsersOnlineInfoDto(false, null, null, null, null, null, 62, null) : U1, qp5.a(usersUserFullDto)));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SpannableStringBuilder o(Context context, sr90 sr90Var, int i) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Pair<Integer, String[]> c2 = sr90Var.c();
        if (sr90Var instanceof q470) {
            String string = context.getString(c2.i().intValue());
            SpannableString spannableString = new SpannableString(string);
            TypedValue typedValue = krv0.a;
            spannableString.setSpan(krv0.c(R.attr.vk_legacy_accent, context), 0, string.length(), 33);
            str = spannableString;
        } else {
            int intValue = c2.i().intValue();
            String[] j = c2.j();
            str = context.getString(intValue, Arrays.copyOf(j, j.length));
        }
        spannableStringBuilder.append((CharSequence) str);
        String b = sr90Var.b();
        if (b != null) {
            spannableStringBuilder.append((CharSequence) " ");
            if (sr90Var instanceof gki0) {
                SpannableString spannableString2 = new SpannableString("·");
                TypedValue typedValue2 = krv0.a;
                spannableString2.setSpan(krv0.c(i, context), 0, spannableString2.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString2);
                spannableStringBuilder.append((CharSequence) " ");
            }
            SpannableString spannableString3 = new SpannableString(b);
            TypedValue typedValue3 = krv0.a;
            spannableString3.setSpan(krv0.c(i, context), 0, spannableString3.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString3);
        }
        return spannableStringBuilder;
    }

    public static final void p(kotlin.coroutines.d dVar, Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            io.reactivex.rxjava3.plugins.a.a(th);
        } catch (Throwable th2) {
            mnh0.d(th, th2);
            rvj.a(dVar, th);
        }
    }

    public static akg0 q(int i, int i2, androidx.compose.runtime.a aVar, com.vk.core.compose.component.semantics.a aVar2, String str, gzs gzsVar) {
        String str2;
        gzs gzsVar2;
        w65.k().getClass();
        ButtonSize buttonSize = ButtonSize.Small;
        w65.k().getClass();
        ButtonStyle buttonStyle = ButtonStyle.Tertiary;
        w65.k().getClass();
        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
        com.vk.core.compose.component.semantics.a aVar3 = (i2 & 8192) != 0 ? null : aVar2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1484079317, i, 24576, "com.vk.core.compose.component.snackbar.SnackbarContent.Right.Button.Companion.invoke (SnackbarContent.kt:72)");
        }
        int i3 = ((i << 3) & 896) | 2097158;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2142655902, i3, 8, "com.vk.core.compose.component.snackbar.remember (RightButtonImpl.kt:88)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            str2 = str;
            gzsVar2 = gzsVar;
            akg0 akg0Var = new akg0(str2, gzsVar2, buttonSize, buttonStyle, buttonAppearance, aVar3);
            aVar.R(akg0Var);
            x = akg0Var;
        } else {
            str2 = str;
            gzsVar2 = gzsVar;
        }
        akg0 akg0Var2 = (akg0) x;
        ((zak0) akg0Var2.a).setValue(str2);
        ((zak0) akg0Var2.b).setValue(gzsVar2);
        ((zak0) akg0Var2.n).setValue(aVar3);
        ((zak0) akg0Var2.d).setValue(buttonSize);
        ((zak0) akg0Var2.c).setValue(buttonStyle);
        ((zak0) akg0Var2.e).setValue(buttonAppearance);
        ((zak0) akg0Var2.f).setValue(null);
        ((zak0) akg0Var2.g).setValue(null);
        ((zak0) akg0Var2.h).setValue(null);
        ((zak0) akg0Var2.i).setValue(null);
        ((zak0) akg0Var2.j).setValue(null);
        ((zak0) akg0Var2.k).setValue(null);
        ((zak0) akg0Var2.l).setValue(null);
        ((zak0) akg0Var2.m).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return akg0Var2;
    }

    public static boolean r(Context context) {
        if (gz80.a(29)) {
            r1 = anj.a(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
            xgx0.a.getClass();
            xgx0.a("VkHealthAndroidPermissionsProvider.hasAndroidPermissionActivityRecognition() -> result: " + r1);
        }
        return r1;
    }

    public static final boolean s(Playlist playlist) {
        boolean z;
        List<Artist> list = playlist.s;
        if (list != null) {
            List<Artist> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Artist) it.next()).Db()) {
                        if (!epx.f(playlist.e, "main_only")) {
                            z = true;
                        }
                    }
                }
            }
        }
        z = false;
        List<Artist> list3 = playlist.r;
        if (list3 != null) {
            List<Artist> list4 = list3;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<T> it2 = list4.iterator();
                while (it2.hasNext()) {
                    if (((Artist) it2.next()).Db()) {
                        break;
                    }
                }
            }
        }
        return z;
    }

    public static final boolean t(Playlist playlist) {
        List<Artist> list = playlist.r;
        if (list != null) {
            List<Artist> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Artist) it.next()).Cb()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean u(Playlist playlist) {
        return playlist.d == 5;
    }

    public static final boolean v(Playlist playlist) {
        PlaylistLink playlistLink = playlist.g;
        if (playlistLink == null) {
            return false;
        }
        UserId userId = playlistLink.c;
        if (o25.a().a(userId)) {
            return true;
        }
        return jnj.h(playlist.O) && !userId.equals(UserId.d);
    }

    public static final boolean w(Playlist playlist) {
        return o25.a().a(playlist.c);
    }

    public static final boolean x(Playlist playlist) {
        return playlist.b < 0;
    }

    public static final String y(one.video.player.tracks.b bVar) {
        String str = ((who0) bVar.c).c;
        String displayLanguage = str != null ? new Locale(str).getDisplayLanguage() : null;
        if (displayLanguage == null) {
            displayLanguage = "";
        }
        if (displayLanguage.length() <= 0) {
            return displayLanguage;
        }
        return ((Object) String.valueOf(displayLanguage.charAt(0)).toUpperCase(Locale.ROOT)) + displayLanguage.substring(1);
    }

    public static final void z(Context context, Intent intent, qa80 qa80Var) {
        int i = RuStoreActivityLauncher.d;
        CallbackResultReceiver callbackResultReceiver = new CallbackResultReceiver(qa80Var);
        Intent intent2 = new Intent(context, (Class<?>) RuStoreActivityLauncher.class);
        if (!(context instanceof Activity)) {
            intent2.setFlags(268435456);
        }
        intent2.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, callbackResultReceiver);
        intent2.putExtra("CONFIRMATION_PENDING_INTENT", PendingIntent.getActivity(context, 0, intent, 1140850688));
        context.startActivity(intent2);
    }

    @Override // xsna.vv60
    public io.reactivex.rxjava3.internal.operators.observable.j1 c(vg60 vg60Var) {
        kf60 kf60Var = new kf60(vg60Var.d, vg60Var.a, vg60Var.b, null, vg60Var.k);
        kf60Var.f = vg60Var.h;
        kf60Var.g = vg60Var.i;
        kf60Var.h = vg60Var.j;
        kf60Var.k = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        kf60Var.i = vg60Var.f;
        JSONObject jSONObject = vg60Var.g;
        kf60Var.j = jSONObject != null ? jSONObject.toString() : null;
        return rsg0.y0(kf60Var.a(), null, null, 3).U(new u730(new bqt(13), 3));
    }

    @Override // xsna.q701
    public Object zza() {
        switch (this.b) {
            case 5:
                List list = s701.a;
                return Long.valueOf(zznn.zzu());
            default:
                List list2 = s701.a;
                return Boolean.valueOf(zznw.zzd());
        }
    }
}
