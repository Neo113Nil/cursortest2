package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;

/* compiled from: ClipEditorAlertType.kt */
/* loaded from: classes16.dex */
public abstract class kuc {
    public final Integer a;
    public final Object[] b;
    public final Integer c;
    public final a d;
    public final a e;

    /* compiled from: ClipEditorAlertType.kt */
    public static final class a {
        public final int a;
        public final Integer b;
        public final gzs<s3q0> c;

        public a(int i, Integer num, gzs<s3q0> gzsVar) {
            this.a = i;
            this.b = num;
            this.c = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(text=");
            sb.append(this.a);
            sb.append(", color=");
            sb.append(this.b);
            sb.append(", action=");
            return uf3.d(sb, this.c, ')');
        }
    }

    /* compiled from: ClipEditorAlertType.kt */
    public static final class b extends kuc {
        public b(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            super(Integer.valueOf(R.string.clip_editor_discard_title), Integer.valueOf(R.string.clip_editor_discard_description), new a(R.string.clip_editor_discard_action_discard, null, gzsVar), new a(R.string.clip_editor_discard_action_cancel, null, gzsVar2));
        }
    }

    /* compiled from: ClipEditorAlertType.kt */
    public static final class c extends kuc {
        public final ks2 f;
        public final ew3 g;
        public final Context h;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ks2 ks2Var, ew3 ew3Var, Context context) {
            super(null, Integer.valueOf(R.string.clip_editor_exit_alert_message), new a(R.string.clip_editor_exit_alert_delete, Integer.valueOf(e3m.f(R.attr.vk_ui_background_negative, context)), ew3Var), r0);
            a aVar = new a(R.string.clip_editor_exit_alert_save, null, ks2Var);
            this.f = ks2Var;
            this.g = ew3Var;
            this.h = context;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + (this.f.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ExitEditorAlert(saveDraftAction=" + this.f + ", deleteDraftAction=" + this.g + ", context=" + this.h + ')';
        }
    }

    /* compiled from: ClipEditorAlertType.kt */
    public static final class d extends kuc {
        public final long f;
        public final cwd g;
        public final lk h;

        public d(long j, cwd cwdVar, lk lkVar) {
            super(Integer.valueOf(R.string.clip_editor_too_long_title), new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j))}, Integer.valueOf(R.string.clip_editor_wrong_length_message), new a(R.string.clip_editor_length_alert_save_draft, null, cwdVar), new a(R.string.clip_editor_length_alert_continue_edit, null, lkVar));
            this.f = j;
            this.g = cwdVar;
            this.h = lkVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f == dVar.f && epx.f(this.g, dVar.g) && epx.f(this.h, dVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + (Long.hashCode(this.f) * 31)) * 31);
        }

        public final String toString() {
            return "TooLongAlert(maxClipsDurationMs=" + this.f + ", saveDraftAction=" + this.g + ", openEditorAction=" + this.h + ')';
        }
    }

    /* compiled from: ClipEditorAlertType.kt */
    public static final class e extends kuc {
        public final long f;
        public final ewd g;
        public final iy2 h;

        public e(long j, ewd ewdVar, iy2 iy2Var) {
            super(Integer.valueOf(R.string.clip_editor_too_short_title), new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j))}, Integer.valueOf(R.string.clip_editor_wrong_length_message), new a(R.string.clip_editor_length_alert_save_draft, null, ewdVar), new a(R.string.clip_editor_length_alert_continue_edit, null, iy2Var));
            this.f = j;
            this.g = ewdVar;
            this.h = iy2Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f == eVar.f && epx.f(this.g, eVar.g) && epx.f(this.h, eVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + ((this.g.hashCode() + (Long.hashCode(this.f) * 31)) * 31);
        }

        public final String toString() {
            return "TooShortAlert(minClipsDurationMs=" + this.f + ", saveDraftAction=" + this.g + ", openEditorAction=" + this.h + ')';
        }
    }

    public kuc(Integer num, Object[] objArr, Integer num2, a aVar, a aVar2) {
        this.a = num;
        this.b = objArr;
        this.c = num2;
        this.d = aVar;
        this.e = aVar2;
    }

    public /* synthetic */ kuc(Integer num, Integer num2, a aVar, a aVar2) {
        this(num, new Object[0], num2, aVar, aVar2);
    }
}
