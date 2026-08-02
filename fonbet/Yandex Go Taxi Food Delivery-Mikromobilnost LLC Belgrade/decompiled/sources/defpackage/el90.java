package defpackage;

import android.content.Context;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.settings.profile.rating.PassengerNameCreatorModalView;

/* loaded from: classes14.dex */
public final class el90 {
    public final dl90 a;
    public final as21 b;
    public final ol90 c;
    public final tse d;
    public final sc e = new sc(8, this);
    public boolean f;

    public el90(dl90 dl90Var, as21 as21Var, ol90 ol90Var, tse tseVar) {
        this.a = dl90Var;
        this.b = as21Var;
        this.c = ol90Var;
        this.d = tseVar;
    }

    public final void a(Context context, ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier, w030 w030Var) {
        if (this.f) {
            return;
        }
        PassengerNameCreatorModalView passengerNameCreatorModalView = new PassengerNameCreatorModalView(context, this.a, this.d, profileAnalyticsReporter$PreviousScreenIdentifier);
        passengerNameCreatorModalView.setOnAppearingListener(this.e);
        w030Var.s(passengerNameCreatorModalView, true);
    }
}
