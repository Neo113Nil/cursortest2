package xsna;

import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import java.util.List;
import xsna.at70;
import xsna.e2e0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class zk30 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zk30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((r3h) obj2).invoke(obj);
                break;
            case 1:
                ((fs5) obj2).invoke(obj);
                break;
            case 2:
                ((xgv) obj2).invoke(obj);
                break;
            case 3:
                ((g6) obj2).invoke(obj);
                break;
            case 4:
                ((h2w) obj2).invoke(obj);
                break;
            case 5:
                ((xgv) obj2).invoke(obj);
                break;
            case 6:
                ((h2w) obj2).invoke(obj);
                break;
            case 7:
                ((xgv) obj2).invoke(obj);
                break;
            case 8:
                ((g6) obj2).invoke(obj);
                break;
            case 9:
                el50 el50Var = (el50) obj2;
                AudioBook audioBook = (AudioBook) obj;
                List<AudioBookChapter> list = audioBook.k;
                if (list != null && !list.isEmpty()) {
                    el50Var.D(el50Var, new cvh(audioBook, 28));
                    break;
                } else {
                    el50Var.W().c(at70.a.a);
                    break;
                }
                break;
            case 10:
                int i2 = com.vk.newsfeed.posting.geo_picker.presentation.e.t1;
                ((hx3) obj2).invoke(obj);
                break;
            case 11:
                ((xgv) obj2).invoke(obj);
                break;
            case 12:
                ((xgv) obj2).invoke(obj);
                break;
            case 13:
                ((fuc0) obj2).invoke(obj);
                break;
            case 14:
                ((fuc0) obj2).invoke(obj);
                break;
            case 15:
                ((fuc0) obj2).invoke(obj);
                break;
            case 16:
                ((e2e0.a) obj2).invoke(obj);
                break;
            case 17:
                ((fuc0) obj2).invoke(obj);
                break;
            case 18:
                ((kpd) obj2).invoke(obj);
                break;
            case 19:
                ((fuc0) obj2).invoke(obj);
                break;
            case 20:
                ((fs5) obj2).invoke(obj);
                break;
            case 21:
                ((fuc0) obj2).invoke(obj);
                break;
            case 22:
                ((fuc0) obj2).invoke(obj);
                break;
            case 23:
                ((fuc0) obj2).invoke(obj);
                break;
            case 24:
                ((p0p0) obj2).invoke(obj);
                break;
            case 25:
                ((hx3) obj2).invoke(obj);
                break;
            case 26:
                ((yte) obj2).invoke(obj);
                break;
            case 27:
                ((gqw0) obj2).invoke(obj);
                break;
            default:
                ((gqw0) obj2).invoke(obj);
                break;
        }
    }
}
