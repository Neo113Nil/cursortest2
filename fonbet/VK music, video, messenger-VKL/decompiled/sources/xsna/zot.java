package xsna;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GesturesFeedbackOnboardingView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class zot extends ConstraintLayout {
    public final List<b69> t;
    public final iri0 u;
    public final View v;
    public final RecyclerView w;
    public final iot x;

    public zot(l7s l7sVar, List list, iri0 iri0Var) {
        super(l7sVar);
        this.t = list;
        this.u = iri0Var;
        LayoutInflater.from(l7sVar).inflate(R.layout.voip_gesture_reactions_snackbar_view, this);
        this.v = findViewById(R.id.close);
        this.w = (RecyclerView) findViewById(R.id.feedback_recycler_view);
        this.x = new iot();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipToOutline(true);
        bwt0.i0(this.v, new lbe(this, 27));
        RecyclerView recyclerView = this.w;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        iot iotVar = this.x;
        recyclerView.setAdapter(iotVar);
        List<b69> list = this.t;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new d1f0((b69) it.next()));
        }
        iotVar.setItems(arrayList);
    }
}
