package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;

/* compiled from: GroupCallParticipantListView.kt */
/* loaded from: classes7.dex */
public final class eiu extends giu {
    public final List<eiu> f0;

    public eiu(Context context) {
        super(cn70.b(10), R.layout.voip_group_call_list_participant, R.drawable.voip_call_participant_border_speaking_10_radius, context);
        this.f0 = Collections.singletonList(this);
    }

    @Override // xsna.giu
    public final boolean X4(kiu kiuVar) {
        return getPinned() ? Q4() && !T4() : (!Q4() || T4() || Y4(kiuVar)) ? false : true;
    }

    @Override // xsna.giu
    public final boolean Y4(kiu kiuVar) {
        if (epx.f(getGetPrimaryParticipantId().invoke(), kiuVar.a.a)) {
            return false;
        }
        return super.Y4(kiuVar);
    }

    @Override // xsna.giu
    public final boolean Z4(kiu kiuVar) {
        if (epx.f(getGetPrimaryParticipantId().invoke(), kiuVar.a.a)) {
            return false;
        }
        return super.Z4(kiuVar);
    }

    @Override // xsna.giu, xsna.tmg0
    public List<eiu> getViewsToRotate() {
        return this.f0;
    }

    @Override // xsna.giu, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getOrientationDelegate().d(this);
    }

    @Override // xsna.giu, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getOrientationDelegate().b(this);
    }
}
