package xsna;

import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.api.generated.groups.dto.GroupsGroupFriendPreviewProfileDto;
import com.vk.clips.sdk.models.ActionLinkSnippet;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.preference.Preference;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.user.UserProfile;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

/* compiled from: BlockButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class we7 implements a7o0 {
    public static final we7 b = new we7(3);
    public static final we7 c = new we7(6);
    public final /* synthetic */ int a;

    public /* synthetic */ we7(int i) {
        this.a = i;
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final Object d(xy2 xy2Var, SuspendLambda suspendLambda) {
        gzg0 gzg0Var = new gzg0(s7s0.c(suspendLambda));
        new jx2(yfb.x(xy2Var), new fy2(gzg0Var)).b();
        Object a = gzg0Var.a();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return a;
    }

    public static void e() {
        Preference.B("NetworkStateHolder");
    }

    @NonNull
    public static CameraUnavailableException f(@NonNull CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int d = cameraAccessExceptionCompat.d();
        int i = 1;
        if (d != 1) {
            i = 2;
            if (d != 2) {
                i = 3;
                if (d != 3) {
                    i = 4;
                    if (d != 4) {
                        i = 5;
                        if (d != 5) {
                            i = d != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new CameraUnavailableException(i, cameraAccessExceptionCompat);
    }

    public static void i(GroupLikes groupLikes, int i, List list, List list2) {
        LinkedHashMap linkedHashMap;
        UserProfile userProfile;
        groupLikes.d = i;
        if (list2 != null) {
            ArrayList X0 = j5g.X0(list, list2);
            int e = on00.e(c5g.u(X0, 10));
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            Iterator it = X0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object i2 = pair.i();
                UserId userId = (UserId) pair.i();
                GroupsGroupFriendPreviewProfileDto groupsGroupFriendPreviewProfileDto = (GroupsGroupFriendPreviewProfileDto) pair.j();
                UserProfile userProfile2 = new UserProfile();
                userProfile2.c = userId;
                userProfile2.d = groupsGroupFriendPreviewProfileDto.d();
                userProfile2.h = zm00.c(groupsGroupFriendPreviewProfileDto.i(), groupsGroupFriendPreviewProfileDto.g(), groupsGroupFriendPreviewProfileDto.e(), groupsGroupFriendPreviewProfileDto.f());
                userProfile2.O = zm00.b(16, groupsGroupFriendPreviewProfileDto.i(), groupsGroupFriendPreviewProfileDto.g(), groupsGroupFriendPreviewProfileDto.e(), groupsGroupFriendPreviewProfileDto.f());
                userProfile2.g = groupsGroupFriendPreviewProfileDto.i();
                Pair pair2 = new Pair(i2, userProfile2);
                linkedHashMap.put(pair2.i(), pair2.j());
            }
        } else {
            linkedHashMap = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UserId userId2 = (UserId) it2.next();
            groupLikes.f.add(userId2);
            if (linkedHashMap != null && (userProfile = (UserProfile) linkedHashMap.get(userId2)) != null) {
                groupLikes.e.add(userProfile);
            }
        }
    }

    public static boolean j(SdkClipVideoFile sdkClipVideoFile, long j) {
        return ((float) Math.max(j, 0L)) >= ((float) TimeUnit.SECONDS.toMillis((long) sdkClipVideoFile.getDuration())) * 0.25f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean k(SdkClipVideoFile sdkClipVideoFile, long j) {
        long j2;
        SdkActionLink m1 = sdkClipVideoFile.m1();
        if (m1 == null) {
            return false;
        }
        ActionLinkSnippet actionLinkSnippet = m1.g;
        if (actionLinkSnippet != null) {
            long j3 = actionLinkSnippet.g;
            Long valueOf = Long.valueOf(j3);
            if (j3 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                j2 = valueOf.longValue();
                return Math.max(j, 0L) < j2;
            }
        }
        j2 = Long.MAX_VALUE;
        if (Math.max(j, 0L) < j2) {
        }
    }

    public static boolean l(SdkClipVideoFile sdkClipVideoFile, long j, Long l) {
        long longValue;
        SdkActionLink m1 = sdkClipVideoFile.m1();
        if (m1 == null) {
            return false;
        }
        if (!m1.e.equals("clips_trend")) {
            l = null;
        }
        if (l != null) {
            longValue = l.longValue();
        } else {
            Long valueOf = m1.g != null ? Long.valueOf(r4.f) : null;
            longValue = valueOf != null ? valueOf.longValue() : 0L;
        }
        return Math.max(j, 0L) >= longValue;
    }

    public static final boolean m(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1100791446, 0, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:36)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-882615028, 0, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z = (((Configuration) aVar.r(AndroidCompositionLocals_androidKt.a)).uiMode & 48) == 32;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return z;
    }

    public static long n() {
        return Preference.m(0L, "NetworkStateHolder", "sendAudioNetworkStatsUntil");
    }

    public static long o() {
        return Preference.m(0L, "NetworkStateHolder", "sendImageNetworkStatsUntil");
    }

    public static long p() {
        return Preference.m(0L, "NetworkStateHolder", "sendNetworkStatUntil");
    }

    @ozl
    public static final String q(JSONObject jSONObject, float f, boolean z) {
        String a = cqm0.a(jSONObject.optString("photo_base", ""));
        if (a != null) {
            String a2 = js5.a(((f >= 2.0f || z) ? AvatarSize.PHOTO_200 : f > 1.0f ? AvatarSize.PHOTO_100 : AvatarSize.PHOTO_50).k(), a);
            if (a2 != null) {
                return a2;
            }
        }
        String optString = jSONObject.optString(((f >= 2.0f || z) ? AvatarSize.PHOTO_200 : f > 1.0f ? AvatarSize.PHOTO_100 : AvatarSize.PHOTO_50).j(), jSONObject.optString("photo_100"));
        if (optString.length() == 0) {
            optString = jSONObject.optString("photo_200");
            if (optString.length() == 0) {
                String optString2 = jSONObject.optString("photo_50");
                if (optString2.length() == 0) {
                    return null;
                }
                return optString2;
            }
        }
        return optString;
    }

    public static si20 r(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        wr.c(6, duplicate);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            wr.c(4, duplicate);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    si20 si20Var = new si20();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    si20Var.b = duplicate;
                    si20Var.a = position;
                    int i6 = position - duplicate.getInt(position);
                    si20Var.c = i6;
                    si20Var.d = si20Var.b.getShort(i6);
                    return si20Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void t(long j, long j2, long j3, boolean z) {
        Preference.F(j, "NetworkStateHolder", "sendNetworkStatUntil");
        Preference.F(j2, "NetworkStateHolder", "sendImageNetworkStatsUntil");
        Preference.F(j3, "NetworkStateHolder", "sendAudioNetworkStatsUntil");
        if (z) {
            nb3.b();
        }
    }

    public void g(File file) throws IOException {
        if (!file.delete() && file.exists()) {
            throw new IOException(z9r.a(file, "failed to delete "));
        }
    }

    public void h(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException(z9r.a(file, "not a readable directory: "));
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                h(file2);
            }
            if (!file2.delete()) {
                throw new IOException(z9r.a(file2, "failed to delete "));
            }
        }
    }

    public void s(File file, File file2) throws IOException {
        g(file2);
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("failed to rename " + file + " to " + file2);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "FileSystem.SYSTEM";
            default:
                return super.toString();
        }
    }

    @Override // xsna.a7o0
    public void b(Runnable runnable) {
    }

    @Override // xsna.a7o0
    public void a(long j, Runnable runnable) {
    }
}
