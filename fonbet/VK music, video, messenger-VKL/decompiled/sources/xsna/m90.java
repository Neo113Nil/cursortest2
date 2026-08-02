package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Activity;
import com.vk.dto.newsfeed.activities.EventActivity;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;

/* compiled from: ActivityEventHolder.kt */
/* loaded from: classes4.dex */
public final class m90 extends qi6<Post> implements View.OnClickListener {
    public final PhotoStripView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final View H;

    public m90(ViewGroup viewGroup) {
        super(R.layout.post_activity_event, viewGroup);
        PhotoStripView photoStripView = (PhotoStripView) this.itemView.findViewById(R.id.photos);
        this.C = photoStripView;
        this.D = (TextView) this.itemView.findViewById(R.id.text);
        this.E = (TextView) this.itemView.findViewById(R.id.date);
        this.F = (TextView) this.itemView.findViewById(R.id.description);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.G = textView;
        View findViewById = this.itemView.findViewById(R.id.done_button);
        this.H = findViewById;
        photoStripView.setPadding(iah0.a(2.0f));
        photoStripView.setOverlapOffset(0.85f);
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(Post post) {
        Activity activity = post.C;
        EventActivity eventActivity = activity instanceof EventActivity ? (EventActivity) activity : null;
        if (eventActivity == null) {
            return;
        }
        int i = eventActivity.d;
        ArrayList<String> arrayList = eventActivity.c;
        boolean z = false;
        this.E.setText(i > 0 ? pvo0.i(false, i, false, false) : "");
        this.F.setText(eventActivity.e);
        int size = arrayList.size();
        PhotoStripView photoStripView = this.C;
        photoStripView.setCount(size);
        photoStripView.l(-1, arrayList);
        bwt0.p0(photoStripView, !arrayList.isEmpty());
        this.D.setText(eventActivity.g);
        int i2 = eventActivity.f;
        boolean z2 = i2 == 1 || i2 == 2 || i2 == 4;
        String str = eventActivity.h;
        TextView textView = this.G;
        textView.setText(str);
        if (!z2) {
            xuo0.a.getClass();
            if (xuo0.c() <= i) {
                z = true;
            }
        }
        bwt0.p0(textView, z);
        bwt0.p0(this.H, z2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        Post q6 = q6();
        Serializer.StreamParcelableAdapter streamParcelableAdapter = q6 != null ? q6.C : null;
        final EventActivity eventActivity = streamParcelableAdapter instanceof EventActivity ? (EventActivity) streamParcelableAdapter : null;
        if (eventActivity == null) {
            return;
        }
        if (!epx.f(view, this.G) && !epx.f(view, this.H)) {
            Post q62 = q6();
            if (q62 != null) {
                hd60.a().s0(this.itemView.getContext(), q62.m, this.u, this.v);
            }
            PostInteract postInteract = this.w;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.open_group);
                return;
            }
            return;
        }
        final Post q63 = q6();
        if (q63 == null) {
            return;
        }
        final String str = q63.L.b;
        final int i = eventActivity.f;
        gd60 a = hd60.a();
        UserId userId = q63.m;
        xuo0.a.getClass();
        a.c(this.H, userId, i, xuo0.c() > ((long) eventActivity.d), this.u, str, new izs() { // from class: xsna.k90
            /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            
                if (r3 != 2) goto L8;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                int i2;
                Post post = q63;
                UserId userId2 = post.m;
                UserId userId3 = (UserId) obj;
                int i3 = i;
                if (i3 != 0) {
                    i2 = 2;
                }
                i2 = 1;
                EventActivity.this.f = i2;
                if (i3 != 0) {
                    cvk.u(R.string.event_decision_changed, false);
                }
                if (epx.f(userId2, fkq0.e(userId3))) {
                    m90 m90Var = this;
                    j6r0.c(8, m90Var.G);
                    j6r0.c(0, m90Var.H);
                }
                String str2 = com.vk.newsfeed.common.util.k.a;
                com.vk.newsfeed.common.util.k.l(post.n, userId2, str, "activity", true);
                return s3q0.a;
            }
        }, new l90(0, eventActivity, q63, this, str));
    }
}
