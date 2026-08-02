package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.NewsfeedResearchEvent;
import com.vk.internal.api.GsonHolder;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* compiled from: ArtistButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class pq3 implements ulv {
    public static String a(int i, Context context) {
        long j = i % 60;
        int i2 = (i % 3600) / 60;
        int i3 = i / 3600;
        if (i3 <= 0) {
            return i2 > 0 ? context.getString(R.string.date_ago_minute_compact, Integer.valueOf(i2)) : context.getString(R.string.date_ago_second_compact, Integer.valueOf((int) j));
        }
        String f = enj.f(R.plurals.music_hours, i3, context);
        return ((long) i2) > 0 ? v1v.a(' ', f, context.getString(R.string.date_ago_minute_compact, Integer.valueOf(i2))) : f;
    }

    public static String c(Context context, long j, long j2) {
        int i = (int) ((j - j2) / 1000);
        String format = i > 3600 ? String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 3600), Integer.valueOf((i % 3600) / 60), Integer.valueOf(i % 60)}, 3)) : String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
        return j2 > 0 ? context.getString(R.string.podcast_time_left, format) : format;
    }

    public static String d(Context context, long j, long j2) {
        long j3 = j - j2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j3);
        long j4 = 60;
        long minutes = timeUnit.toMinutes(j3) % j4;
        long seconds = timeUnit.toSeconds(j3) % j4;
        if (hours <= 0) {
            return minutes > 0 ? context.getResources().getQuantityString(R.plurals.music_minutes_left, (int) minutes, context.getString(R.string.music_minutes_short, Long.valueOf(minutes))) : context.getResources().getQuantityString(R.plurals.music_minutes_left, (int) seconds, context.getString(R.string.music_second_short, Long.valueOf(seconds)));
        }
        int i = (int) hours;
        String f = enj.f(R.plurals.music_hours, i, context);
        String string = context.getString(R.string.music_minutes_short, Long.valueOf(minutes));
        Resources resources = context.getResources();
        if (minutes > 0) {
            f = v1v.a(' ', f, string);
        }
        return resources.getQuantityString(R.plurals.music_hours_left, i, f);
    }

    public static final eo20 e() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1139510916, 0, -1, "com.vk.core.compose.component.defaults.<get-VkTooltipDefaults> (VkTooltipDefaults.kt:19)");
        }
        eo20 eo20Var = eo20.b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return eo20Var;
    }

    public static final void f(kotlin.coroutines.d dVar, Throwable th) {
        Throwable runtimeException;
        Iterator<pvj> it = qvj.a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(dVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    mnh0.d(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            mnh0.d(th, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static xy2 i(pq3 pq3Var, UserId userId, int i, String str, List list, Integer num, Integer num2, Float f, Float f2, Float f3, Float f4, int i2) {
        Integer num3 = (i2 & 32) != 0 ? null : num2;
        Float f5 = (i2 & 64) != 0 ? null : f;
        Float f6 = (i2 & 128) != 0 ? null : f2;
        Float f7 = (i2 & 256) != 0 ? null : f3;
        Float f8 = (i2 & 512) == 0 ? f4 : null;
        pq3Var.getClass();
        tfx tfxVar = new tfx("narratives.edit", new fr(26), new hr(24));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "narrative_id", i, 0, 0, 8);
        tfx.o(tfxVar, "title", str, 0, 0, 12);
        if (list != null) {
            tfxVar.i("story_ids", list);
        }
        if (num != null) {
            tfx.l(tfxVar, "cover_story_id", num.intValue(), 0, 0, 8);
        }
        if (num3 != null) {
            tfx.l(tfxVar, "custom_cover_photo_id", num3.intValue(), 0, 0, 8);
        }
        if (f5 != null) {
            tfxVar.h("crop_x", f5.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (f6 != null) {
            tfxVar.h("crop_y", f6.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (f7 != null) {
            tfxVar.h("crop_width", f7.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        if (f8 != null) {
            tfxVar.h("crop_height", f8.floatValue(), -1.7976931348623157E308d, Double.MAX_VALUE);
        }
        tfxVar.j("extended", true);
        return tfxVar;
    }

    public static xy2 j(pq3 pq3Var, List list, List list2, String str, int i) {
        ArrayList arrayList;
        Boolean bool = Boolean.TRUE;
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        String str2 = (i & 8) != 0 ? null : str;
        pq3Var.getClass();
        tfx tfxVar = new tfx("narratives.getById", new yu50(0), new nr(22));
        tfxVar.i("narratives", list);
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    public static boolean k(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean l(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void m(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof t160) {
            ((t160) viewParent).s1(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void n(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof u160) {
            ((u160) viewParent).a2(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof t160) {
            ((t160) viewParent).H0(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void o(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof t160) {
            ((t160) viewParent).l0(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean p(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof t160) {
            return ((t160) viewParent).h4(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void q(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof t160) {
            ((t160) viewParent).c0(i, view);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.completable.d r(ia4 ia4Var, List list) {
        List<NewsfeedResearchEvent> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (NewsfeedResearchEvent newsfeedResearchEvent : list2) {
            arrayList.add(ia4Var.c(newsfeedResearchEvent.b, newsfeedResearchEvent.c));
        }
        return new io.reactivex.rxjava3.internal.operators.completable.d(arrayList);
    }

    @Override // xsna.ulv
    public boolean b() {
        return true;
    }

    public boolean g() {
        return Boolean.TRUE.booleanValue();
    }

    public tfx h(UserId userId, List list) {
        tfx tfxVar = new tfx("narratives.batchEdit", new gr(23), new dn(25));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.o(tfxVar, "operations", GsonHolder.a().toJson(list), 0, 0, 12);
        return tfxVar;
    }
}
