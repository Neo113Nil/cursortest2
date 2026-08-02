package xsna;

import android.content.Context;
import android.content.res.Resources;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketDto;
import com.vk.api.generated.wall.dto.WallActionButtonVkTicketSeanceDto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ActionButtonAttachment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.fsi;
import xsna.tlo0;

/* compiled from: VkTicketActionButtonHolderTransformer.kt */
/* loaded from: classes4.dex */
public final class srv0 implements gn60<Pair<? extends NewsEntry, ? extends ActionButtonAttachment>, wm60> {
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ol60> a(int i, Pair<? extends NewsEntry, ActionButtonAttachment> pair, wm60 wm60Var) {
        fsi.b.a aVar;
        String e;
        T t;
        String str;
        WallActionButtonVkTicketSeanceDto d;
        String f;
        String f2;
        NewsEntry d2 = pair.d();
        ActionButtonAttachment g = pair.g();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        WallActionButtonVkTicketDto wallActionButtonVkTicketDto = g.o;
        String str2 = g.g;
        if (wallActionButtonVkTicketDto != null) {
            WallActionButtonVkTicketSeanceDto d3 = wallActionButtonVkTicketDto.d();
            Pair g2 = (d3 == null || (f2 = d3.f()) == null) ? null : his0.g(f2);
            if (g2 != null) {
                String str3 = (String) g2.d();
                tlo0.h d4 = oq.d(tlo0.Companion, (String) g2.g());
                tlo0.h hVar = new tlo0.h(str3);
                try {
                    d = wallActionButtonVkTicketDto.d();
                } catch (Exception e2) {
                    L.i(e2);
                }
                if (d != null && (f = d.f()) != null) {
                    LocalDateTime parse = LocalDateTime.parse(f, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
                    int dayOfMonth = parse.getDayOfMonth();
                    int value = parse.getMonth().getValue() - 1;
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Resources resources = context.getResources();
                    if (resources != null) {
                        Integer valueOf = Integer.valueOf(dayOfMonth);
                        String[] stringArray = resources.getStringArray(R.array.vk_months_full);
                        if (value > 11) {
                            value = 11;
                        }
                        str = resources.getString(R.string.date_format_day_month, valueOf, stringArray[value]);
                        t = new fsi.a.C2891a(d4, hVar, str);
                    }
                }
                str = null;
                t = new fsi.a.C2891a(d4, hVar, str);
            } else {
                t = 0;
            }
            ref$ObjectRef.element = t;
            aVar = new fsi.b.a(oq.d(tlo0.Companion, str2));
        } else {
            aVar = null;
        }
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = g.l;
        if (newsfeedNewsfeedItemHeaderTextDto == null || (e = newsfeedNewsfeedItemHeaderTextDto.e()) == null) {
            WallActionButtonVkTicketDto wallActionButtonVkTicketDto2 = g.o;
            String title = wallActionButtonVkTicketDto2 != null ? wallActionButtonVkTicketDto2.getTitle() : null;
            if (title != null) {
                str2 = title;
            }
        } else {
            str2 = e;
        }
        return Collections.singletonList(new fsi(g, d2, oq.d(tlo0.Companion, str2), (fsi.a) ref$ObjectRef.element, aVar));
    }

    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, pair, bp5Var);
    }
}
