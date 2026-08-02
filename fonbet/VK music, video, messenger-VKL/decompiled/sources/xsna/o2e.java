package xsna;

import android.view.View;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipAudioTemplate;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.f9j0;
import xsna.t2e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class o2e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ o2e(Object obj, Object obj2, View view, Object obj3, Object obj4, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = view;
        this.f = obj3;
        this.g = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                final q2e q2eVar = (q2e) obj5;
                final zlq zlqVar = (zlq) obj4;
                final VideoFile videoFile = (VideoFile) obj3;
                final za zaVar = (za) obj2;
                Throwable th = (Throwable) obj;
                ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = h2e.a;
                if (!(th instanceof VKApiExecutionException)) {
                    if (th instanceof CompositeException) {
                        List<Throwable> d = ((CompositeException) th).d();
                        if (!(d instanceof Collection) || !d.isEmpty()) {
                            Iterator<T> it = d.iterator();
                            while (it.hasNext()) {
                                if (((Throwable) it.next()) instanceof VKApiExecutionException) {
                                }
                            }
                        }
                    }
                    return io.reactivex.rxjava3.core.x.i(th);
                }
                k9x q = swe0.q(0, 5);
                ArrayList arrayList = new ArrayList(c5g.u(q, 10));
                j9x it2 = q.iterator();
                while (it2.d) {
                    it2.nextInt();
                    arrayList.add(f9j0.a.a);
                }
                final t2e.a aVar = new t2e.a(arrayList);
                final View view = this.c;
                return io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.j2e
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        q2e.e(zlqVar, q2eVar, view, videoFile, zaVar, t2e.a.this);
                    }
                }).q(asu0.a.d()).e(q2eVar.c(q2eVar.b, h2e.a, true));
            default:
                ((com.vk.catalog.mvi.block.video.impl.p002short.draft.d) obj5).c.e("ClipsGridDraftsListFragment");
                View view2 = this.c;
                ((v8f) obj4).d(view2, (ClipAudioTemplate) obj3, (ShortVideoGetTemplateExtendedResponseDto) obj, (String) obj2);
                return s3q0.a;
        }
    }
}
