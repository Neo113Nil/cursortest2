package xsna;

import android.content.Context;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.stories.analytics.session.storage.permissions.CallReason;
import com.vkontakte.android.data.b;

/* compiled from: CameraTracker.kt */
/* loaded from: classes16.dex */
public final class am9 {
    public final a a = new a();
    public Integer b;

    /* compiled from: CameraTracker.kt */
    public static final class a {
        public String a;
        public Long b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Integer g;
        public String h;
        public String i;
        public String j;
        public boolean k;
        public boolean l;
        public String m;

        public a() {
            aj9 aj9Var = ij9.a;
            this.l = ij9.a.a();
        }

        public final void a(String str) {
            this.a = str;
        }

        public final void b(String str) {
            this.e = str;
        }

        public final void c(String str) {
            this.j = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CameraStatInfo(cameraEntryPoint=");
            sb.append(this.a);
            sb.append(", userId=");
            sb.append(this.b);
            sb.append(", objectId=");
            sb.append(this.c);
            sb.append(", objectType=");
            sb.append(this.d);
            sb.append(", cameraMode=");
            sb.append(this.e);
            sb.append(", cameraState=");
            sb.append(this.f);
            sb.append(", questionStoryId=");
            sb.append(this.g);
            sb.append(", questionTheme=");
            sb.append(this.h);
            sb.append(", questionText=");
            sb.append(this.i);
            sb.append(", ref=");
            sb.append(this.j);
            sb.append(", isLightOn=");
            sb.append(this.k);
            sb.append(", isFrontalCamera=");
            sb.append(this.l);
            sb.append(", maskId=");
            return ho8.a(sb, this.m, ')');
        }
    }

    public final a a() {
        return this.a;
    }

    public final b.d b(String str, izs<? super b.d, s3q0> izsVar) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a("camera_action", "action_type", str);
        a aVar = this.a;
        a2.b(aVar.b, "user_id");
        a2.b(aVar.c, "object_id");
        a2.b(aVar.d, "object_type");
        a2.b(aVar.e, "camera_mode");
        a2.b(aVar.f, "camera_state");
        a2.b(aVar.a, "camera_entry_point");
        a2.b(aVar.g, "question_story_id");
        a2.b(aVar.h, "question_theme");
        a2.b(aVar.i, "question_text");
        a2.b(Boolean.valueOf((aVar.g == null || aVar.h == null || aVar.i == null) ? false : true), "has_question_reply");
        a2.b(aVar.j, "ref");
        if (izsVar != null) {
            izsVar.invoke(a2);
        }
        a2.e();
        return a2;
    }

    public final void c(StoryPublishEvent storyPublishEvent, izs<? super b.d, s3q0> izsVar) {
        nf9.j(storyPublishEvent, this.a, null, null, new ku1(6, this, izsVar), 28);
    }

    public final void d(StoryPublishEvent storyPublishEvent) {
        nf9.j(storyPublishEvent, this.a, null, null, new tb(this, 20), 12);
    }

    public final void e(Context context, StoryPublishEvent storyPublishEvent, StoryCameraMode storyCameraMode) {
        if (storyCameraMode == null || !storyCameraMode.j()) {
            return;
        }
        if (storyPublishEvent == StoryPublishEvent.CAMERA_ACCESS_AUTHORIZED || storyPublishEvent == StoryPublishEvent.CAMERA_ACCESS_DENIED) {
            nf9 nf9Var = nf9.b;
            nf9.e().d().a(context, CallReason.SET_ACCESS, (r6 & 4) == 0, (r6 & 8) == 0);
        }
        c(storyPublishEvent, new u8(this, 13));
    }
}
