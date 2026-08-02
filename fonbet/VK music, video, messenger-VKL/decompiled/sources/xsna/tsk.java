package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ironsource.C4628x1;
import com.ironsource.InterfaceC4386ja;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.feature.music.ui.holder.MusicPlaceholderVh;
import com.vk.core.files.a;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.hints.HintId;
import com.vk.log.L;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.reefton.Reef;
import com.vkontakte.android.R;
import java.util.Iterator;
import ru.ok.android.webrtc.noisesuppressor.NoiseSuppressorActiveState;
import xsna.b660;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class tsk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tsk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((usk) obj).getClass();
                break;
            case 1:
                v7r v7rVar = (v7r) obj;
                String file = v7rVar.c.toString();
                boolean a = v7rVar.a(file);
                v7rVar.c();
                Iterator<L.a> it = L.i.iterator();
                while (it.hasNext()) {
                    it.next().a(file, a);
                }
                break;
            case 2:
                ((a.C0764a) obj).b(new Exception("Some files cannot be loaded to cache"));
                break;
            case 3:
                final MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder = (MusicBigPlayerTrackListHolder) obj;
                final String id = HintId.INFO_BUBBLE_CREATE_PLAYLIST_FROM_PLAYER.getId();
                Rect rect = new Rect();
                musicBigPlayerTrackListHolder.t.getGlobalVisibleRect(rect);
                Activity h = e3m.h(musicBigPlayerTrackListHolder.itemView.getContext());
                if (h != null) {
                    l7v b = pla.e().b();
                    b.getClass();
                    l7v.b bVar = new l7v.b(id, b, rect);
                    bVar.g = new DialogInterface.OnDismissListener() { // from class: xsna.zb40
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MusicBigPlayerTrackListHolder.this.r = null;
                            pla.e().b().b(id);
                        }
                    };
                    musicBigPlayerTrackListHolder.r = bVar.j(h);
                    break;
                }
                break;
            case 4:
                MusicPlaceholderVh musicPlaceholderVh = (MusicPlaceholderVh) obj;
                qcy<Object>[] qcyVarArr = MusicPlaceholderVh.o;
                Rect rect2 = new Rect(0, 0, iah0.f().widthPixels, iah0.f().heightPixels);
                VkPlaceholder vkPlaceholder = musicPlaceholderVh.i;
                if (vkPlaceholder == null) {
                    vkPlaceholder = null;
                }
                Rect F = bwt0.F(vkPlaceholder);
                VkPlaceholder vkPlaceholder2 = musicPlaceholderVh.i;
                if (vkPlaceholder2 == null) {
                    vkPlaceholder2 = null;
                }
                if (bwt0.D(vkPlaceholder2) >= 1.0f && rect2.contains(F)) {
                    UIBlockPlaceholder uIBlockPlaceholder = musicPlaceholderVh.n;
                    if (uIBlockPlaceholder != null) {
                        if (uIBlockPlaceholder.v) {
                            View view = musicPlaceholderVh.j;
                            if (view == null) {
                                view = null;
                            }
                            view.measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                            View view2 = musicPlaceholderVh.j;
                            if (view2 == null) {
                                view2 = null;
                            }
                            f4m.n(-1, view2);
                        } else {
                            VkPlaceholder vkPlaceholder3 = musicPlaceholderVh.i;
                            if (vkPlaceholder3 == null) {
                                vkPlaceholder3 = null;
                            }
                            vkPlaceholder3.measure(0, 0);
                            View view3 = musicPlaceholderVh.j;
                            if (view3 == null) {
                                view3 = null;
                            }
                            f4m.n(-2, view3);
                        }
                        VkPlaceholder vkPlaceholder4 = musicPlaceholderVh.i;
                        if (vkPlaceholder4 == null) {
                            vkPlaceholder4 = null;
                        }
                        vkPlaceholder4.requestLayout();
                        View view4 = musicPlaceholderVh.j;
                        (view4 != null ? view4 : null).requestLayout();
                        break;
                    }
                } else {
                    View view5 = musicPlaceholderVh.j;
                    if (view5 == null) {
                        view5 = null;
                    }
                    if (view5.getLayoutParams().height == -1) {
                        View view6 = musicPlaceholderVh.j;
                        if (view6 == null) {
                            view6 = null;
                        }
                        ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                        layoutParams.height = -2;
                        View view7 = musicPlaceholderVh.j;
                        (view7 != null ? view7 : null).setLayoutParams(layoutParams);
                        break;
                    }
                }
                break;
            case 5:
                b660.c cVar = (b660.c) obj;
                b660.b bVar2 = cVar.a.get();
                if (bVar2 != null) {
                    bVar2.a(cVar.c.b());
                    break;
                }
                break;
            case 6:
                NoiseSuppressorActiveState.Builder.a((gzs) obj);
                break;
            case 7:
                ((BottomSheetBehavior) obj).X(3);
                break;
            case 8:
                ((pgh0) obj).a.scrollToPosition(0);
                break;
            case 9:
                Reef m = ((hwl0) obj).m();
                if (m != null) {
                    m.g.onNext(Reef.State.RELEASED);
                    break;
                }
                break;
            case 10:
                ViewGroup viewGroup = ((nhn0) obj).h;
                (viewGroup != null ? viewGroup : null).findViewById(R.id.qr_scanner_animation).setVisibility(0);
                break;
            case 11:
                View view8 = (View) obj;
                ((InputMethodManager) view8.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view8, 1);
                break;
            case 12:
                ((mjw0) obj).w();
                break;
            case 13:
                ((com.my.tracker.obfuscated.e) obj).b();
                break;
            case 14:
                ydz0 ydz0Var = (ydz0) obj;
                lly0 lly0Var = ydz0Var.g;
                View[] viewArr = {ydz0Var.k};
                if (lly0Var.getVisibility() == 0) {
                    lly0Var.a(0, viewArr);
                    break;
                }
                break;
            default:
                C4628x1.c((InterfaceC4386ja) obj);
                break;
        }
    }

    public /* synthetic */ tsk(usk uskVar, long j) {
        this.b = 0;
        this.c = uskVar;
    }
}
