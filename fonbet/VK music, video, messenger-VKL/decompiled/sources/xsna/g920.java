package xsna;

import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: MergedQuestionsViewHolder.kt */
/* loaded from: classes6.dex */
public final class g920 extends vfz<s3j> {
    public final UxPollEntryPoint l;
    public final n8 m;
    public final LinearLayoutCompat n;
    public final ArrayList o;

    public g920(ViewGroup viewGroup, UxPollEntryPoint uxPollEntryPoint, n8 n8Var) {
        super(R.layout.polls_page_merged, viewGroup);
        this.l = uxPollEntryPoint;
        this.m = n8Var;
        this.n = (LinearLayoutCompat) this.itemView.findViewById(R.id.polls_page_merged_root);
        this.o = new ArrayList();
    }

    @Override // xsna.vfz
    public final void W5(s3j s3jVar) {
        s3j s3jVar2 = s3jVar;
        ArrayList arrayList = s3jVar2.d;
        ArrayList arrayList2 = this.o;
        int i = 0;
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                ((ype0) next).setState((xpe0) arrayList.get(i));
                i = i2;
            }
            return;
        }
        ArrayList arrayList3 = s3jVar2.c;
        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
        for (Object obj : arrayList3) {
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            j4r0 j4r0Var = new j4r0((PollQuestion) obj);
            j4r0Var.b = this.itemView.getContext();
            j4r0Var.c = this.m;
            UxPollEntryPointLocation.a aVar = UxPollEntryPointLocation.Companion;
            UxPollEntryPointLocation uxPollEntryPointLocation = this.l.c;
            aVar.getClass();
            ype0 d = j4r0Var.d(new zpe0(UxPollEntryPointLocation.a.a(uxPollEntryPointLocation)));
            this.n.addView(d.getUiView(), new LinearLayoutCompat.a(-1, -2));
            d.setState((xpe0) arrayList.get(i));
            arrayList4.add(d);
            i = i3;
        }
        arrayList2.addAll(arrayList4);
    }
}
