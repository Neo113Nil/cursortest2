package xsna;

import androidx.annotation.NonNull;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;
import xsna.qbb0;

/* compiled from: PlaylistMusicLoader.java */
/* loaded from: classes3.dex */
public final class pbb0 implements hx2<AudioGetResponseDto> {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qbb0 d;

    public pbb0(qbb0 qbb0Var, int i, int i2) {
        this.d = qbb0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.hx2
    public final void b(AudioGetResponseDto audioGetResponseDto) {
        qbb0 qbb0Var = this.d;
        qbb0Var.i = null;
        ArrayList<MusicTrack> arrayList = (ArrayList) audioGetResponseDto.d().stream().map(new nbb0()).collect(Collectors.toCollection(new obb0()));
        int i = this.c;
        int i2 = this.b;
        if (i2 == 0) {
            qbb0Var.l &= !arrayList.isEmpty();
            qbb0Var.k = i;
            qbb0Var.m = arrayList;
            ArrayList arrayList2 = qbb0Var.o;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((qbb0.a) it.next()).dd(qbb0Var);
                }
                return;
            }
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        qbb0Var.l = !isEmpty;
        if (!isEmpty) {
            qbb0Var.k = i2 + i;
            qbb0Var.m.addAll(arrayList);
        }
        ArrayList arrayList3 = qbb0Var.o;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((qbb0.a) it2.next()).A5(qbb0Var, arrayList);
            }
        }
    }

    @Override // xsna.hx2
    public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        qbb0 qbb0Var = this.d;
        qbb0Var.i = null;
        String vKApiExecutionException2 = vKApiExecutionException.toString();
        qbb0Var.n = vKApiExecutionException2;
        L.G("vk", vKApiExecutionException2);
        if (this.b == 0) {
            ArrayList arrayList = qbb0Var.o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((qbb0.a) it.next()).Q8(qbb0Var);
                }
                return;
            }
            return;
        }
        ArrayList arrayList2 = qbb0Var.o;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((qbb0.a) it2.next()).getClass();
            }
        }
    }
}
