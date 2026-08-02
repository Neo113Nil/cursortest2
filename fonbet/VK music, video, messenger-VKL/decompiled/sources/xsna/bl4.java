package xsna;

import com.vk.api.generated.audioBooks.dto.AudioBooksItemPersonDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksItemPersonRoleDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: AudioBooksItemPersonDtoToAudioBookPersonMapper.kt */
/* loaded from: classes3.dex */
public final class bl4 {
    public static final ne6 a = new ne6();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        r2.add(r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(List list) {
        char c;
        ArrayList arrayList;
        List<AudioBooksItemPersonDto> list2 = list;
        char c2 = '\n';
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (AudioBooksItemPersonDto audioBooksItemPersonDto : list2) {
            int id = audioBooksItemPersonDto.getId();
            String e = audioBooksItemPersonDto.e();
            String description = audioBooksItemPersonDto.getDescription();
            List<BaseImageDto> f = audioBooksItemPersonDto.f();
            a.getClass();
            Image a2 = ne6.a(f);
            List<AudioBooksItemPersonRoleDto> g = audioBooksItemPersonDto.g();
            if (g != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : g) {
                    AudioBooksItemPersonRoleDto audioBooksItemPersonRoleDto = (AudioBooksItemPersonRoleDto) obj;
                    AudioBookPersonRole[] values = AudioBookPersonRole.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (epx.f(audioBooksItemPersonRoleDto.getId(), values[i].i())) {
                                arrayList3.add(obj);
                                break;
                            }
                            i++;
                        }
                    }
                }
                c = '\n';
                arrayList = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AudioBooksItemPersonRoleDto audioBooksItemPersonRoleDto2 = (AudioBooksItemPersonRoleDto) it.next();
                    AudioBookPersonRole.a aVar = AudioBookPersonRole.Companion;
                    String id2 = audioBooksItemPersonRoleDto2.getId();
                    aVar.getClass();
                    for (AudioBookPersonRole audioBookPersonRole : AudioBookPersonRole.h()) {
                        if (brm0.w(audioBookPersonRole.i(), id2, true)) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            c = c2;
            arrayList = null;
            ArrayList arrayList4 = arrayList;
            Integer d = audioBooksItemPersonDto.d();
            arrayList2.add(new AudioBookPerson(id, e, description, a2, arrayList4, d != null ? d.intValue() : 0));
            c2 = c;
        }
        return arrayList2;
    }
}
