package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.vk.dto.badges.Badgeable;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;

/* compiled from: ReactionsFacadeApi.kt */
/* loaded from: classes5.dex */
public interface h3f0 {
    boolean a(View view, Rect rect, p2f0 p2f0Var, c6z c6zVar, NewsEntry newsEntry, String str);

    boolean b(View view, Rect rect, p2f0 p2f0Var, gzs<s3q0> gzsVar, MotionEvent motionEvent, Object obj, Object obj2, String str, boolean z);

    void c(Context context, Badgeable badgeable, UserId userId, int i);

    void d(Context context, Badgeable badgeable);

    void e(v5f0 v5f0Var);
}
