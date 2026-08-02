package xsna;

import com.vk.api.generated.audioBooks.dto.AudioBooksAudioBookDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksAudioFileDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksChapterDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksGenreDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksImageDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksItemPersonDto;
import com.vk.api.generated.audioBooks.dto.AudioBooksPublisherDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBookGenre;
import com.vk.dto.music.audiobook.AudioBookPublisher;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.dto.music.audiobook.AudioBooksChapterProgressStatus;
import java.util.ArrayList;
import java.util.List;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: AudioBookDtoToAudioBookMapper.kt */
/* loaded from: classes3.dex */
public final class eg4 {
    public static AudioBook a(AudioBooksAudioBookDto audioBooksAudioBookDto) {
        Image image;
        ArrayList arrayList;
        int id = audioBooksAudioBookDto.getId();
        String title = audioBooksAudioBookDto.getTitle();
        String e = audioBooksAudioBookDto.e();
        int p = audioBooksAudioBookDto.p();
        boolean K = audioBooksAudioBookDto.K();
        int duration = audioBooksAudioBookDto.getDuration();
        AudioBooksPublisherDto B = audioBooksAudioBookDto.B();
        AudioBookPublisher audioBookPublisher = B == null ? null : new AudioBookPublisher(B.getId(), B.d());
        int G = audioBooksAudioBookDto.G();
        List<AudioBooksImageDto> j = audioBooksAudioBookDto.j();
        if (j == null || ((AudioBooksImageDto) j5g.a0(j)) == null) {
            image = null;
        } else {
            List<AudioBooksImageDto> list = j;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (AudioBooksImageDto audioBooksImageDto : list) {
                arrayList2.add(new ImageSize(audioBooksImageDto.getUrl(), audioBooksImageDto.getWidth(), audioBooksImageDto.getHeight(), null, (char) 0, false, 56, null));
            }
            image = new Image(arrayList2);
        }
        List<AudioBooksChapterDto> g = audioBooksAudioBookDto.g();
        if (g == null || ((AudioBooksChapterDto) j5g.a0(g)) == null) {
            arrayList = null;
        } else {
            List<AudioBooksChapterDto> list2 = g;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (AudioBooksChapterDto audioBooksChapterDto : list2) {
                int i = al4.$EnumSwitchMapping$0[audioBooksChapterDto.f().ordinal()];
                AudioBooksChapterProgressStatus audioBooksChapterProgressStatus = i != 1 ? i != 2 ? AudioBooksChapterProgressStatus.DONE : AudioBooksChapterProgressStatus.IN_PROGRESS : AudioBooksChapterProgressStatus.UNREAD;
                String id2 = audioBooksChapterDto.getId();
                String title2 = audioBooksChapterDto.getTitle();
                AudioBooksAudioFileDto d = audioBooksChapterDto.d();
                AudioBookFile audioBookFile = new AudioBookFile(d.getUrl(), d.getDuration());
                int g2 = audioBooksChapterDto.g();
                String r = audioBooksChapterDto.r();
                Integer i2 = audioBooksChapterDto.i();
                Integer e2 = audioBooksChapterDto.e();
                arrayList.add(new AudioBookChapter(id2, title2, audioBookFile, g2, audioBooksChapterProgressStatus, r, i2, e2 != null ? e2.intValue() : 0, null, null, Tensorflow.FRAME_HEIGHT, null));
            }
        }
        ne6 ne6Var = bl4.a;
        ArrayList a = bl4.a(audioBooksAudioBookDto.f());
        ArrayList a2 = bl4.a(audioBooksAudioBookDto.u());
        List<AudioBooksItemPersonDto> F = audioBooksAudioBookDto.F();
        ArrayList a3 = F != null ? bl4.a(F) : null;
        List<AudioBooksGenreDto> l = audioBooksAudioBookDto.l();
        ArrayList arrayList3 = new ArrayList(c5g.u(l, 10));
        for (AudioBooksGenreDto audioBooksGenreDto : l) {
            arrayList3.add(new AudioBookGenre(audioBooksGenreDto.getId(), audioBooksGenreDto.d()));
            image = image;
            id = id;
        }
        Image image2 = image;
        int i3 = id;
        String i4 = audioBooksAudioBookDto.i();
        Integer C = audioBooksAudioBookDto.C();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = a3;
        AudioBookPublisher audioBookPublisher2 = audioBookPublisher;
        boolean o = audioBooksAudioBookDto.o();
        AudioBooksAccessStatus.a aVar = AudioBooksAccessStatus.Companion;
        String i5 = audioBooksAudioBookDto.d().i();
        aVar.getClass();
        AudioBooksAccessStatus a4 = AudioBooksAccessStatus.a.a(i5);
        Integer k = audioBooksAudioBookDto.k();
        int intValue = k != null ? k.intValue() : 0;
        MediaPopupDto D = audioBooksAudioBookDto.D();
        return new AudioBook(i3, title, e, p, K, duration, audioBookPublisher2, G, image2, arrayList4, a, a2, arrayList5, arrayList3, i4, C, o, a4, audioBooksAudioBookDto.r(), intValue, D != null ? emi.v(D) : null, audioBooksAudioBookDto.n());
    }
}
