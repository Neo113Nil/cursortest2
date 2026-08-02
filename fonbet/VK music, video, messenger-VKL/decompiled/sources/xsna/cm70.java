package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: NpsSurveyController.kt */
/* loaded from: classes17.dex */
public final class cm70 {
    public static final /* synthetic */ qcy<Object>[] j = {new MutablePropertyReference1Impl(cm70.class, "subscriptionUploadingSurvey", "getSubscriptionUploadingSurvey()Lio/reactivex/rxjava3/disposables/Disposable;", 0), p5j.a(0, cm70.class, "subscriptionExternalNpsShowing", "getSubscriptionExternalNpsShowing()Lio/reactivex/rxjava3/disposables/Disposable;", fpf0.a)};
    public final View a;
    public final se5 b;
    public final hfq c;
    public final View d;
    public final VkText e;
    public final ImageView f;
    public final ysg0<a> g = new ysg0<>();
    public final pgn h = new pgn();
    public final pgn i = new pgn();

    /* compiled from: NpsSurveyController.kt */
    public static abstract class a {

        /* compiled from: NpsSurveyController.kt */
        /* renamed from: xsna.cm70$a$a, reason: collision with other inner class name */
        public static final class C2668a extends a {
            public static final C2668a a = new C2668a();
        }

        /* compiled from: NpsSurveyController.kt */
        public static final class b extends a {
            public final ExternalNpsCondition a;

            public b(ExternalNpsCondition externalNpsCondition) {
                this.a = externalNpsCondition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Required(trigger=" + this.a + ')';
            }
        }
    }

    public cm70(View view, fed fedVar, hfq hfqVar) {
        this.a = view;
        this.b = fedVar;
        this.c = hfqVar;
        this.d = view.findViewById(R.id.clips_nps_survey_popup);
        this.e = (VkText) view.findViewById(R.id.tv_go_to_survey);
        this.f = (ImageView) view.findViewById(R.id.iv_close);
    }
}
