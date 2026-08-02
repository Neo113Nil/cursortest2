package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayAudioBookSource;
import com.vk.music.playlist.display.audiobook.offline.presentation.feature.OfflineAudioBookChaptersMviState;
import com.vk.music.stats.AdsAudioPixelsContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.at70;
import xsna.ln50;
import xsna.us70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qma implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qma(int i, ts70 ts70Var) {
        this.b = 3;
        this.c = i;
        this.d = ts70Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        List<AudioBookChapter> list;
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((sma) this.d).b(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                j2k.a((gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).intValue();
                ((c0l) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 3:
                ts70 ts70Var = (ts70) this.d;
                el50 el50Var = (el50) obj;
                us70 us70Var = (us70) obj2;
                if (epx.f(us70Var, us70.c.b)) {
                    el50Var.W().c(at70.c.a);
                } else {
                    boolean f = epx.f(us70Var, us70.a.b);
                    int i = this.c;
                    if (f) {
                        el50Var.f(el50Var, new in50(fpf0.a(us70.a.class)), ln50.a.a, new lf40(ts70Var, i, el50Var));
                    } else {
                        Object obj3 = null;
                        if (us70Var instanceof us70.b) {
                            AudioBook o = ((OfflineAudioBookChaptersMviState) el50Var.W().getCurrentState()).o();
                            if (o != null && (list = o.k) != null) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        if (epx.f(((AudioBookChapter) next).b, ((us70.b) us70Var).b)) {
                                            obj3 = next;
                                        }
                                    }
                                }
                                AudioBookChapter audioBookChapter = (AudioBookChapter) obj3;
                                if (audioBookChapter != null) {
                                    el50Var.W().c(new at70.b(new AudioBookChapterBottomSheetLaunchPoint.RemoveDownload(i, audioBookChapter.b, audioBookChapter.j)));
                                }
                            }
                        } else {
                            if (!(us70Var instanceof us70.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AudioBook o2 = ((OfflineAudioBookChaptersMviState) el50Var.W().getCurrentState()).o();
                            if (o2 != null) {
                                String str = ((us70.d) us70Var).b;
                                List<AudioBookChapter> list2 = o2.k;
                                if (list2 != null) {
                                    List<AudioBookChapter> list3 = list2;
                                    Iterator<T> it2 = list3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            Object next2 = it2.next();
                                            if (epx.f(((AudioBookChapter) next2).b, str)) {
                                                obj3 = next2;
                                            }
                                        }
                                    }
                                    AudioBookChapter audioBookChapter2 = (AudioBookChapter) obj3;
                                    if (audioBookChapter2 != null) {
                                        MusicTrack d = com.vk.dto.music.audiobook.a.d(o2, audioBookChapter2);
                                        StartPlayAudioBookSource startPlayAudioBookSource = new StartPlayAudioBookSource(o2, null, null, 6, null);
                                        AudioBookFile audioBookFile = audioBookChapter2.d;
                                        int i2 = (audioBookFile == null || audioBookChapter2.e != audioBookFile.c) ? audioBookChapter2.e * 1000 : 0;
                                        u2b0 u2b0Var = ts70Var.c;
                                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                                        Iterator<T> it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList.add(com.vk.dto.music.audiobook.a.d(o2, (AudioBookChapter) it3.next()));
                                        }
                                        u2b0Var.N0(new lqk0(startPlayAudioBookSource, d, arrayList, ts70Var.b, i2, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 912));
                                    }
                                }
                            }
                        }
                    }
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((fkg0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((hsn0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ qma(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ qma(fkg0 fkg0Var, int i) {
        this.b = 4;
        this.d = fkg0Var;
        this.c = i;
    }

    public /* synthetic */ qma(hsn0 hsn0Var, int i) {
        this.b = 5;
        this.d = hsn0Var;
        this.c = i;
    }
}
