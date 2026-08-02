package xsna;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.media3.exoplayer.f;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.log.L;
import com.vk.music.player.PlayerTrack;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.stats.PostViewFragmentTimeSpentTracker;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.utils.Logger;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import xsna.ftn0;
import xsna.q1d0;
import xsna.rye;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xq8 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                wh50 wh50Var = (wh50) this.c;
                VkButton vkButton = (VkButton) this.d;
                wh50Var.setValue(Boolean.FALSE);
                vkButton.setLoading(false);
                return;
            case 1:
                rye.b bVar = (rye.b) this.c;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.d;
                rye ryeVar = bVar.c;
                if (ryeVar != null) {
                    ryeVar.setOnCancelListener(new tye(cVar, 0));
                    return;
                }
                return;
            case 2:
                mj80 mj80Var = (mj80) this.c;
                gzs gzsVar = (gzs) this.d;
                mj80Var.getClass();
                gzsVar.invoke();
                return;
            case 3:
                rxa0 rxa0Var = (rxa0) this.c;
                PlayerTrack playerTrack = (PlayerTrack) this.d;
                yxa0 yxa0Var = rxa0Var.b;
                SQLiteDatabase writableDatabase = yxa0Var.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    writableDatabase.execSQL("DELETE FROM current_track WHERE user_id = " + yxa0.o() + " AND COL_QUEUE_TYPE = " + yxa0Var.n());
                    if (playerTrack != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("uuid", playerTrack.f);
                        contentValues.put(X3.i.L, Integer.valueOf(playerTrack.d));
                        contentValues.put("progress_ms", Long.valueOf(playerTrack.e));
                        contentValues.put("music_track", dni0.a(playerTrack.b));
                        contentValues.put("launch_meta", dni0.a(playerTrack.c));
                        contentValues.put("user_id", Long.valueOf(yxa0.o()));
                        contentValues.put("COL_QUEUE_TYPE", Integer.valueOf(yxa0Var.n()));
                        writableDatabase.insert("current_track", null, contentValues);
                    }
                    s3q0 s3q0Var = s3q0.a;
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return;
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            case 4:
                PostViewFragment postViewFragment = (PostViewFragment) this.c;
                RecyclerView recyclerView = (RecyclerView) this.d;
                String[] strArr = PostViewFragment.T0;
                PostViewFragmentTimeSpentTracker Do = postViewFragment.Do();
                if (Do != null) {
                    Do.a(recyclerView);
                    return;
                }
                return;
            case 5:
                q1d0.d dVar = (q1d0.d) this.c;
                androidx.media3.exoplayer.source.h hVar = (androidx.media3.exoplayer.source.h) this.d;
                q1d0 q1d0Var = q1d0.this;
                boolean E = q1d0Var.E();
                q1d0.c cVar2 = q1d0Var.l;
                if (E) {
                    return;
                }
                o1d0 o1d0Var = (o1d0) hVar;
                if (dVar.c && hVar.getBufferedPositionUs() == Long.MIN_VALUE) {
                    cVar2.e(q1d0Var);
                    q1d0Var.G();
                    return;
                }
                if (dVar.c && !cVar2.d(q1d0Var, o1d0Var.b.getBufferedPositionUs())) {
                    q1d0Var.G();
                    return;
                }
                f.a aVar = new f.a();
                aVar.a = dVar.b;
                o1d0Var.k(new androidx.media3.exoplayer.f(aVar));
                if (dVar.c && hVar.getBufferedPositionUs() == Long.MIN_VALUE) {
                    cVar2.e(q1d0Var);
                    q1d0Var.G();
                    return;
                }
                return;
            case 6:
                ((xkg0) this.c).g((String) this.d);
                return;
            case 7:
                SessionRoomListenerManagerImpl.onRoomRemoved$lambda$0((SessionRoomListenerManagerImpl) this.c, (CallSessionRoomsListener.RemovedParams) this.d);
                return;
            case 8:
                jzl0 jzl0Var = (jzl0) this.c;
                oy30 oy30Var = (oy30) this.d;
                a1w a1wVar = q1w.a;
                io.reactivex.rxjava3.internal.operators.single.f0 q = (a1wVar != null ? a1wVar : null).C("StoryHighlightsRedesignDelegate", oy30Var).q(asu0.a.c());
                new c220(23);
                jzl0Var.f = q.subscribe(new fzl0(), new o7y(new izl0(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 19));
                return;
            case 9:
                ArrayList arrayList = (ArrayList) this.c;
                ftn0 ftn0Var = (ftn0) this.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ftn0.b bVar2 = (ftn0.b) it.next();
                    RecyclerView.e0 e0Var = bVar2.a;
                    int i = bVar2.b;
                    int i2 = bVar2.c;
                    int i3 = bVar2.d;
                    int i4 = bVar2.e;
                    View view = e0Var.itemView;
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    ftn0Var.B.add(e0Var);
                    animate.setDuration(ftn0Var.e).setListener(new jtn0(ftn0Var, e0Var, i5, view, i6, animate)).start();
                }
                arrayList.clear();
                ftn0Var.y.remove(arrayList);
                return;
            default:
                yads.md1.a((yads.md1) this.c, (Activity) this.d);
                return;
        }
    }
}
