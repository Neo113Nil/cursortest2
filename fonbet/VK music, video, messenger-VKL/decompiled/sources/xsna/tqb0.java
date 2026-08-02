package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollOption;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: PollOptionViewNew.kt */
/* loaded from: classes6.dex */
public final class tqb0 extends FrameLayout {
    public static final float g = iah0.a(48);
    public static final float h = 6.0f;
    public static final float i = 8.0f;
    public final TextView b;
    public final TextView c;
    public final CheckBox d;
    public final ProgressBar e;
    public final rqb0 f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollOptionViewNew.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DONE_ICON_COLOR_NO_BACKGROUND;
        public static final a REST_PART_COLOR_NO_BACKGROUND;
        public static final a RESULT_LEADER_PART_COLOR_NO_BACKGROUND;
        public static final a RESULT_PART_COLOR_NO_BACKGROUND;
        public static final a TEXT_COLOR_NO_BACKGROUND;
        private final int colorId;

        /* compiled from: PollOptionViewNew.kt */
        /* renamed from: xsna.tqb0$a$a, reason: collision with other inner class name */
        public static final class C3762a extends a {
            @Override // xsna.tqb0.a
            public final int a(Context context) {
                return l8g.f(0.1f, context.getColor(R.color.vk_blue_600));
            }
        }

        /* compiled from: PollOptionViewNew.kt */
        public static final class b extends a {
            @Override // xsna.tqb0.a
            public final int a(Context context) {
                return l8g.f(0.22f, context.getColor(R.color.vk_blue_600));
            }
        }

        /* compiled from: PollOptionViewNew.kt */
        public static final class c extends a {
            @Override // xsna.tqb0.a
            public final int a(Context context) {
                return l8g.f(0.16f, context.getColor(R.color.vk_blue_600));
            }
        }

        static {
            a aVar = new a("TEXT_COLOR_NO_BACKGROUND", 0, R.color.vk_black);
            TEXT_COLOR_NO_BACKGROUND = aVar;
            b bVar = new b("RESULT_LEADER_PART_COLOR_NO_BACKGROUND", 1, R.color.vk_blue_600);
            RESULT_LEADER_PART_COLOR_NO_BACKGROUND = bVar;
            c cVar = new c("RESULT_PART_COLOR_NO_BACKGROUND", 2, R.color.vk_blue_600);
            RESULT_PART_COLOR_NO_BACKGROUND = cVar;
            C3762a c3762a = new C3762a("REST_PART_COLOR_NO_BACKGROUND", 3, R.color.vk_blue_600);
            REST_PART_COLOR_NO_BACKGROUND = c3762a;
            a aVar2 = new a("DONE_ICON_COLOR_NO_BACKGROUND", 4, R.color.vk_azure_300);
            DONE_ICON_COLOR_NO_BACKGROUND = aVar2;
            a[] aVarArr = {aVar, bVar, cVar, c3762a, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.colorId = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public int a(Context context) {
            return context.getColor(this.colorId);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollOptionViewNew.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b DONE_ICON_COLOR_WITH_BACKGROUND;
        public static final b REST_PART_COLOR_WITH_BACKGROUND;
        public static final b RESULT_LEADER_PART_COLOR_WITH_BACKGROUND;
        public static final b RESULT_PART_COLOR_WITH_BACKGROUND;
        public static final b TEXT_COLOR_WITH_BACKGROUND;

        /* renamed from: long, reason: not valid java name */
        private final long f53long;

        static {
            b bVar = new b("TEXT_COLOR_WITH_BACKGROUND", 0, 4294967295L);
            TEXT_COLOR_WITH_BACKGROUND = bVar;
            b bVar2 = new b("RESULT_LEADER_PART_COLOR_WITH_BACKGROUND", 1, 1728053247L);
            RESULT_LEADER_PART_COLOR_WITH_BACKGROUND = bVar2;
            b bVar3 = new b("RESULT_PART_COLOR_WITH_BACKGROUND", 2, 1040187391L);
            RESULT_PART_COLOR_WITH_BACKGROUND = bVar3;
            b bVar4 = new b("REST_PART_COLOR_WITH_BACKGROUND", 3, 536870911L);
            REST_PART_COLOR_WITH_BACKGROUND = bVar4;
            b bVar5 = new b("DONE_ICON_COLOR_WITH_BACKGROUND", 4, 4294967295L);
            DONE_ICON_COLOR_WITH_BACKGROUND = bVar5;
            b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b(String str, int i, long j) {
            this.f53long = j;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public final int h() {
            return (int) this.f53long;
        }
    }

    public tqb0(Context context) {
        super(context, null, 0);
        rqb0 rqb0Var = new rqb0();
        rqb0Var.c = iah0.b(h);
        this.f = rqb0Var;
        LayoutInflater.from(context).inflate(R.layout.view_poll_option_new, this);
        this.b = (TextView) findViewById(R.id.option_name);
        this.c = (TextView) findViewById(R.id.results);
        this.d = (CheckBox) findViewById(R.id.multiple_choice_checkbox);
        this.e = (ProgressBar) findViewById(R.id.progress);
        setBackground(rqb0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r4v19, types: [xsna.rqb0] */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v49 */
    public final void a(Poll poll, PollOption pollOption, boolean z, v2l0 v2l0Var) {
        int i2;
        boolean z2;
        int[] iArr;
        boolean z3;
        Drawable drawable;
        Drawable a2;
        Drawable newDrawable;
        String str = pollOption.c;
        float f = pollOption.e;
        List<Long> list = poll.e;
        long j = pollOption.b;
        boolean contains = list.contains(Long.valueOf(j));
        PollBackground pollBackground = poll.s;
        boolean z4 = pollBackground instanceof PollContentColor;
        if (z4) {
            this.f.c = iah0.b(i);
        }
        boolean contains2 = poll.Ib() ? list.contains(Long.valueOf(j)) : false;
        CheckBox checkBox = this.d;
        checkBox.setChecked(contains2);
        checkBox.jumpDrawablesToCurrentState();
        checkBox.setVisibility((!poll.Ib() || (z && !poll.Bb())) ? 8 : 0);
        int[][] iArr2 = {new int[]{-16842912}, new int[]{android.R.attr.state_checked}};
        boolean z5 = true;
        if (!z4 || v2l0Var == null) {
            i2 = -1;
            z2 = false;
            if (pollBackground != null) {
                iArr = new int[]{-1, -1};
            } else {
                int color = getContext().getColor(R.color.vk_azure_300);
                iArr = new int[]{color, color};
            }
        } else {
            i2 = -1;
            checkBox.setAlpha(0.64f);
            z2 = false;
            int b2 = v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_MULTIVOTE_OPTION_CHECKBOX);
            iArr = new int[]{b2, b2};
        }
        checkBox.setButtonTintList(new ColorStateList(iArr2, iArr));
        String str2 = poll.Bb() ? str : null;
        TextView textView = this.b;
        textView.setContentDescription(str2);
        textView.setText(str);
        textView.setTextColor(b(pollBackground, v2l0Var));
        if (z4) {
            Context context = getContext();
            bpn0 bpn0Var = enj.a;
            textView.setTypeface(dbg0.a(R.font.vk_roboto_medium, context));
            int a3 = iah0.a(10);
            f4m.t(a3, textView);
            f4m.q(a3, textView);
            textView.setTextSize(1, 14.0f);
        }
        Drawable background = getBackground();
        if (background instanceof rqb0) {
            ?? r4 = (rqb0) background;
            z3 = z2;
            r4.a(!poll.Bb() ? Math.round((f / 100) * 10000) : z2, z3);
            r4.b = (!z4 || v2l0Var == null) ? pollBackground != null ? b.REST_PART_COLOR_WITH_BACKGROUND.h() : a.REST_PART_COLOR_NO_BACKGROUND.a(getContext()) : v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_OPTION_BACKGROUND);
            float Gb = poll.Gb();
            boolean Jb = poll.Jb();
            r4.a = (!z4 || v2l0Var == null) ? pollBackground != null ? (f == Gb && Jb) ? b.RESULT_LEADER_PART_COLOR_WITH_BACKGROUND.h() : b.RESULT_PART_COLOR_WITH_BACKGROUND.h() : (f == Gb && Jb) ? a.RESULT_LEADER_PART_COLOR_NO_BACKGROUND.a(getContext()) : a.RESULT_PART_COLOR_NO_BACKGROUND.a(getContext()) : v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_OPTION_RESULT_BACKGROUND);
        } else {
            z3 = z2;
        }
        String str3 = "";
        ?? r6 = this.c;
        if (z) {
            if (!poll.Bb()) {
                Serializer.c<PollOption> cVar = PollOption.CREATOR;
                str3 = PollOption.a.a(f);
            }
            r6.setText(str3);
        } else {
            r6.setText("");
        }
        if (poll.Ib() && (!poll.Ib() || !z)) {
            z5 = z3;
        }
        if (poll.isClosed() || !contains || !z5 || (a2 = m33.a(R.drawable.vk_icon_done_16, getContext())) == null) {
            drawable = null;
        } else {
            Drawable.ConstantState constantState = a2.getConstantState();
            drawable = (constantState == null || (newDrawable = constantState.newDrawable()) == null) ? null : newDrawable.mutate();
            int h2 = (!z4 || v2l0Var == null) ? pollBackground != null ? b.DONE_ICON_COLOR_WITH_BACKGROUND.h() : a.DONE_ICON_COLOR_NO_BACKGROUND.a(getContext()) : v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_OPTION_RESULT_TEXT);
            if (drawable != null) {
                drawable.setTint(h2);
            }
        }
        r6.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
        r6.setVisibility(!poll.Bb() ? z3 : 8);
        r6.setTextColor(z4 ? (pollBackground == null || v2l0Var == null) ? pollBackground != null ? b.TEXT_COLOR_WITH_BACKGROUND.h() : a.TEXT_COLOR_NO_BACKGROUND.a(getContext()) : v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_OPTION_RESULT_TEXT) : b(pollBackground, v2l0Var));
        ProgressBar progressBar = this.e;
        progressBar.setVisibility(8);
        progressBar.getIndeterminateDrawable().setColorFilter(pollBackground == null ? getContext().getColor(R.color.vk_azure_300) : i2, PorterDuff.Mode.MULTIPLY);
    }

    public final int b(PollBackground pollBackground, v2l0 v2l0Var) {
        return (!(pollBackground instanceof PollContentColor) || v2l0Var == null) ? pollBackground != null ? b.TEXT_COLOR_WITH_BACKGROUND.h() : a.TEXT_COLOR_NO_BACKGROUND.a(getContext()) : v2l0Var.b(getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_OPTION_TEXT);
    }
}
