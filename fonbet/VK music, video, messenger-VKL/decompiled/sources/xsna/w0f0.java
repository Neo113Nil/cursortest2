package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.PaidReaction;
import com.vk.im.reactions.api.chips.ReactionChipStyle;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.toggle.features.ImFeatures;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import xsna.v0f0;

/* compiled from: ReactionChipsContainerViewImpl.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class w0f0 extends v0f0 implements hux0 {
    public static final int q = cn70.b(4);
    public static final int r = cn70.b(2);
    public static final int s = cn70.b(4);
    public static final int t = cn70.b(4);
    public static final int u = cn70.b(4);
    public static final int v = cn70.b(4);
    public final hbw b;
    public final zaw c;
    public final paw d;
    public final t0f0 e;
    public final FlexboxLayoutManager f;
    public int g;
    public boolean h;
    public final TextPaint i;
    public final Paint j;
    public int k;
    public int l;
    public boolean m;
    public v0f0.a n;
    public boolean o;
    public final TimeAndStatusView p;

    public w0f0(Context context, hbw hbwVar, zaw zawVar, paw pawVar) {
        super(context, null);
        this.b = hbwVar;
        this.c = zawVar;
        this.d = pawVar;
        t0f0 t0f0Var = new t0f0(zawVar, pawVar);
        this.e = t0f0Var;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        this.f = flexboxLayoutManager;
        this.g = -16777216;
        TextPaint textPaint = new TextPaint();
        this.i = textPaint;
        this.j = new Paint();
        TimeAndStatusView timeAndStatusView = new TimeAndStatusView(context, null, 0, 12, 0);
        timeAndStatusView.setDarkBackground(this.h);
        timeAndStatusView.setTimeTextColor(this.g);
        this.p = timeAndStatusView;
        setPadding(t, v, u, 0);
        setLayoutManager(flexboxLayoutManager);
        flexboxLayoutManager.I(0);
        setAdapter(t0f0Var);
        int i = s;
        addItemDecoration(new zgk0(i, 0, i));
        setItemAnimator(new n5f0());
        setClipToPadding(false);
        com.vk.typography.b.e(textPaint, getContext(), C.SANS_SERIF_NAME, Float.valueOf(12), TextSizeUnit.PX);
    }

    @Override // xsna.hux0
    public final void X3() {
        requestLayout();
        invalidate();
    }

    @Override // xsna.v0f0
    public final void a(boolean z, wzs<? super Integer, ? super Boolean, s3q0> wzsVar, izs<? super Integer, s3q0> izsVar) {
        dq1 dq1Var = new dq1(z, this, wzsVar);
        t0f0 t0f0Var = this.e;
        t0f0Var.e = dq1Var;
        t0f0Var.f = new ll1(22, (Object) this, (izs) izsVar);
    }

    public final boolean c() {
        Paint paint = this.j;
        return (paint.getColor() == 0 || paint.getAlpha() == 0) ? false : true;
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TimeAndStatusView timeAndStatusView = getTimeAndStatusView();
        float measuredWidth = (((getMeasuredWidth() - getPaddingRight()) - q) - this.k) - (c() ? cn70.b(4) : 0);
        float measuredHeight = (getMeasuredHeight() - r) - this.l;
        int b = c() ? cn70.b(1) : 0;
        canvas.save();
        canvas.translate(measuredWidth, measuredHeight - b);
        timeAndStatusView.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getTimeAndStatusView().layout(0, 0, getTimeAndStatusView().getMeasuredWidth(), getTimeAndStatusView().getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ae, code lost:
    
        if (r5 < r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r5 < r0) goto L40;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth() - (getPaddingRight() + getPaddingLeft());
        if (getTimeAndStatusView().getVisibility() == 8) {
            this.k = 0;
            this.l = 0;
            return;
        }
        getTimeAndStatusView().measure(0, 0);
        this.k = getTimeAndStatusView().getMeasuredWidth();
        this.l = getTimeAndStatusView().getMeasuredHeight();
        v0f0.a aVar = this.n;
        if (aVar != null) {
            m5f0 m5f0Var = m5f0.a;
            aux0 aux0Var = aVar.a;
            int measuredWidth2 = getMeasuredWidth();
            m5f0Var.getClass();
            i3 = ((Number) j5g.i0(m5f0.b(measuredWidth2, aux0Var.K()))).intValue();
        } else {
            i3 = 0;
        }
        int measuredHeight = (this.m || !(measuredWidth - i3 >= this.k + q)) ? getMeasuredHeight() + this.l : getMeasuredHeight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int b = measuredHeight + (c() ? cn70.b(4) : 0);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            if (size >= suggestedMinimumHeight && size >= b) {
            }
            suggestedMinimumHeight = size;
        } else if (mode != 0) {
            if (mode != 1073741824) {
                throw new IllegalArgumentException(lhg.a(mode, "Unknown specMode: "));
            }
            suggestedMinimumHeight = size;
        }
        setMeasuredDimension(getMeasuredWidth(), suggestedMinimumHeight);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // xsna.v0f0
    public void setIsIncognito(boolean z) {
        this.o = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    @Override // xsna.v0f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setItems(v0f0.a aVar) {
        ArrayList arrayList;
        int i;
        aux0 aux0Var;
        boolean z;
        boolean z2;
        FlexboxLayoutManager flexboxLayoutManager;
        MsgReaction msgReaction;
        List list;
        boolean z3;
        PaidReaction paidReaction;
        this.n = aVar;
        this.m = !aVar.h;
        aux0 aux0Var2 = aVar.a;
        boolean z4 = aVar.i;
        Msg msg = aVar.b;
        ReactionChipStyle reactionChipStyle = aVar.c;
        int i2 = aVar.d;
        m5f0.a.getClass();
        boolean c = m5f0.c(aux0Var2.K());
        boolean z5 = msg instanceof MsgFromChannel;
        Integer num = null;
        MsgFromChannel msgFromChannel = z5 ? (MsgFromChannel) msg : null;
        int i3 = (msgFromChannel == null || (paidReaction = msgFromChannel.I.o) == null) ? 0 : paidReaction.b;
        ArrayList arrayList2 = new ArrayList();
        if ((z4 || i3 != 0) && z5) {
            ImFeatures imFeatures = ImFeatures.VKM_CHANNEL_DONUT_REACTION;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                arrayList = arrayList2;
                EmptyList emptyList = EmptyList.b;
                PaidReaction paidReaction2 = ((MsgFromChannel) msg).I.o;
                i = i2;
                arrayList.add(new k0f0(-2, emptyList, i3, (paidReaction2 != null ? paidReaction2.c : 0) > 0, reactionChipStyle, dhr0.t.c(R.attr.vk_ui_accent_purple), msg.c, msg.d, msg.b, true, i3 > 0));
                List<MsgReaction> D0 = j5g.D0(new mhm(new nde((byte) 0, 8), 1), aux0Var2.K());
                ArrayList arrayList3 = new ArrayList(c5g.u(D0, 10));
                for (MsgReaction msgReaction2 : D0) {
                    ArrayList arrayList4 = arrayList3;
                    int id = msgReaction2.getId();
                    List C0 = j5g.C0(msgReaction2.u2());
                    int count = msgReaction2.getCount();
                    int id2 = msgReaction2.getId();
                    Integer R5 = aux0Var2.R5();
                    if (R5 != null && id2 == R5.intValue()) {
                        list = C0;
                        z3 = true;
                    } else {
                        list = C0;
                        z3 = false;
                    }
                    arrayList4.add(new k0f0(id, list, count, z3, reactionChipStyle, i, msg.c, msg.d, msg.b, msg instanceof MsgFromChannel, c));
                    arrayList3 = arrayList4;
                    aux0Var2 = aux0Var2;
                }
                aux0Var = aux0Var2;
                g5g.y(arrayList3, arrayList);
                m5f0 m5f0Var = m5f0.a;
                List<Integer> list2 = aVar.e;
                m5f0Var.getClass();
                if (!msg.i && list2.contains(Integer.valueOf(msg.d))) {
                    List<MsgReaction> K = aux0Var.K();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : K) {
                        int id3 = ((MsgReaction) obj).getId();
                        Integer R52 = aux0Var.R5();
                        if (R52 == null || id3 != R52.intValue()) {
                            arrayList5.add(obj);
                        }
                    }
                    msgReaction = (MsgReaction) j5g.x0(arrayList5, Random.b);
                    if (msgReaction != null) {
                        num = Integer.valueOf(msgReaction.getId());
                    }
                }
                if (num != null) {
                    this.d.c(msg.b, num.intValue(), msg.c);
                }
                z = aVar.g;
                t0f0 t0f0Var = this.e;
                if (z) {
                    t0f0Var.g = arrayList;
                    t0f0Var.notifyDataSetChanged();
                } else {
                    m.d a = androidx.recyclerview.widget.m.a(new f3f0(arrayList, t0f0Var.g), true);
                    t0f0Var.g = arrayList;
                    a.b(t0f0Var);
                }
                z2 = aVar.f;
                flexboxLayoutManager = this.f;
                if (flexboxLayoutManager.d == z2) {
                    flexboxLayoutManager.d = z2 ? 1 : 0;
                    flexboxLayoutManager.requestLayout();
                    return;
                }
                return;
            }
        }
        i = i2;
        arrayList = arrayList2;
        List<MsgReaction> D02 = j5g.D0(new mhm(new nde((byte) 0, 8), 1), aux0Var2.K());
        ArrayList arrayList32 = new ArrayList(c5g.u(D02, 10));
        while (r22.hasNext()) {
        }
        aux0Var = aux0Var2;
        g5g.y(arrayList32, arrayList);
        m5f0 m5f0Var2 = m5f0.a;
        List<Integer> list22 = aVar.e;
        m5f0Var2.getClass();
        if (!msg.i) {
            List<MsgReaction> K2 = aux0Var.K();
            ArrayList arrayList52 = new ArrayList();
            while (r2.hasNext()) {
            }
            msgReaction = (MsgReaction) j5g.x0(arrayList52, Random.b);
            if (msgReaction != null) {
            }
        }
        if (num != null) {
        }
        z = aVar.g;
        t0f0 t0f0Var2 = this.e;
        if (z) {
        }
        z2 = aVar.f;
        flexboxLayoutManager = this.f;
        if (flexboxLayoutManager.d == z2) {
        }
    }

    @Override // xsna.v0f0
    public void setProfiles(ProfilesSimpleInfo profilesSimpleInfo) {
        this.e.h = profilesSimpleInfo;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.e0 a = wjf0.a(this, i);
            r0f0 r0f0Var = a instanceof r0f0 ? (r0f0) a : null;
            if (r0f0Var != null) {
                r0f0Var.l.setProfilesInfo(profilesSimpleInfo);
            }
        }
    }

    @Override // xsna.v0f0
    public void setTimeBgColor(int i) {
        this.j.setColor(i);
        this.h = i != 0;
        getTimeAndStatusView().setDarkBackground(this.h);
        invalidate();
    }

    @Override // xsna.v0f0
    public void setTimeTextColor(int i) {
        this.g = i;
        this.i.setColor(i);
        getTimeAndStatusView().setTimeTextColor(i);
        invalidate();
    }
}
