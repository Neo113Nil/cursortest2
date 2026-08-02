package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;

/* compiled from: ExternalNpsBlockViewHolder.kt */
/* loaded from: classes17.dex */
public final class zeq extends vfz<FeedItem.e.a> {
    public static final float p = iah0.b(8.0f);
    public final hfq l;
    public final View m;
    public final ImageView n;
    public io.reactivex.rxjava3.disposables.c o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeq(Context context, hfq hfqVar) {
        super(LayoutInflater.from(new l7s(context, dhr0.u().c)).inflate(R.layout.clip_feed_external_nps_holder, (ViewGroup) null, false));
        dhr0.a.getClass();
        this.l = hfqVar;
        this.itemView.setLayoutParams(new ViewGroup.LayoutParams(-1, iah0.a(450)));
        bwt0.d(this.itemView, p, (r4 & 2) != 0, (r4 & 4) != 0);
        this.m = this.itemView.findViewById(R.id.external_nps_begin_poll_view);
        this.n = (ImageView) this.itemView.findViewById(R.id.external_nps_preview_view);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(FeedItem.e.a aVar) {
        FeedItem.e.a aVar2 = aVar;
        if (this.n.getDrawable() == null && this.o == null) {
            this.o = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.xeq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zeq.this.itemView.getContext().getDrawable(R.drawable.vk_icon_illustration_clips_feed_150);
                }
            }).q(io.reactivex.rxjava3.schedulers.a.a()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ov2(new ugm(this, 4), 18), new yeq(new d37(15), 0));
        }
        jjc.g(this.m, new com.vk.libvideo.b(15, this, aVar2));
    }
}
