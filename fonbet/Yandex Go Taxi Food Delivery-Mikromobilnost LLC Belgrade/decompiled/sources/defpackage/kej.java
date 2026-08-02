package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionChangeDateTimeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeOptionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeScreenButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChangeDateTimeScreenDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.DialogButtonActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.DialogButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.TimeslotDto;

/* loaded from: classes.dex */
public final class kej {
    public final ow a;

    public kej(ow owVar) {
        this.a = owVar;
    }

    public final jw40 a(MultiorderDialogDto multiorderDialogDto) {
        String title = multiorderDialogDto.getTitle();
        String text = multiorderDialogDto.getText();
        kw40 b = b(multiorderDialogDto.getPrimaryButton());
        DialogButtonDto secondaryButton = multiorderDialogDto.getSecondaryButton();
        return new jw40(title, text, b, secondaryButton != null ? b(secondaryButton) : null, multiorderDialogDto.getShimmering(), multiorderDialogDto.getHeaderIconImageTag());
    }

    public final kw40 b(DialogButtonDto dialogButtonDto) {
        nr nrVar;
        String title = dialogButtonDto.getTitle();
        String subtitle = dialogButtonDto.getSubtitle();
        DialogButtonActionDto action = dialogButtonDto.getAction();
        nr nrVar2 = null;
        if (action != null) {
            ow owVar = this.a;
            owVar.getClass();
            if (action instanceof DialogButtonActionDto.DialogButtonAction_ChangeDateTimeDto) {
                ActionChangeDateTimeDto actionChangeDateTimeDto = ((DialogButtonActionDto.DialogButtonAction_ChangeDateTimeDto) action).b;
                String title2 = actionChangeDateTimeDto.getTitle();
                String badgeText = actionChangeDateTimeDto.getBadgeText();
                pa9 f = ow.f(actionChangeDateTimeDto.getScreen());
                List<ChangeDateTimeOptionDto> options = actionChangeDateTimeDto.getOptions();
                ArrayList arrayList = new ArrayList(tcc.n(options, 10));
                Iterator<T> it = options.iterator();
                while (it.hasNext()) {
                    arrayList.add(ow.e((ChangeDateTimeOptionDto) it.next()));
                }
                nrVar = new nn(title2, badgeText, f, arrayList);
            } else if (action instanceof DialogButtonActionDto.DialogButtonAction_DialogDto) {
                ActionDialogDto actionDialogDto = ((DialogButtonActionDto.DialogButtonAction_DialogDto) action).b;
                nrVar2 = new pn(actionDialogDto.getTitle(), actionDialogDto.getBadgeText(), actionDialogDto.getImageTag(), ((kej) owVar.d.get()).a(actionDialogDto.getDialog()));
            } else {
                if (!(action instanceof DialogButtonActionDto.Unknown_DialogButtonActionDto)) {
                    w511.b();
                    return null;
                }
                nrVar = cr.a;
            }
            nrVar2 = nrVar;
        }
        return new kw40(title, subtitle, nrVar2);
    }

    public final DialogButtonDto c(kw40 kw40Var) {
        DialogButtonActionDto dialogButtonActionDto;
        String c = kw40Var.c();
        String b = kw40Var.b();
        nr a = kw40Var.a();
        if (a != null) {
            this.a.getClass();
            if (a instanceof nn) {
                nn nnVar = (nn) a;
                String c2 = nnVar.c();
                String d = nnVar.d();
                pa9 f = nnVar.f();
                ChangeDateTimeScreenDto changeDateTimeScreenDto = new ChangeDateTimeScreenDto(f.d(), f.c(), new ChangeDateTimeScreenButtonDto(f.b().a()), new ChangeDateTimeScreenButtonDto(f.a().a()));
                List<ja9> e = nnVar.e();
                ArrayList arrayList = new ArrayList(tcc.n(e, 10));
                for (ja9 ja9Var : e) {
                    String a2 = ja9Var.a();
                    List<pez0> b2 = ja9Var.b();
                    ArrayList arrayList2 = new ArrayList(tcc.n(b2, 10));
                    for (pez0 pez0Var : b2) {
                        arrayList2.add(new TimeslotDto(pez0Var.e(), pez0Var.c(), pez0Var.d(), pez0Var.a(), pez0Var.b().booleanValue()));
                    }
                    arrayList.add(new ChangeDateTimeOptionDto(a2, arrayList2));
                }
                dialogButtonActionDto = new DialogButtonActionDto.DialogButtonAction_ChangeDateTimeDto("change_date_time", new ActionChangeDateTimeDto(c2, d, changeDateTimeScreenDto, arrayList));
            } else {
                dialogButtonActionDto = new DialogButtonActionDto.Unknown_DialogButtonActionDto(0);
            }
        } else {
            dialogButtonActionDto = null;
        }
        return new DialogButtonDto(c, b, dialogButtonActionDto);
    }

    public final MultiorderDialogDto d(jw40 jw40Var) {
        String e = jw40Var.e();
        String d = jw40Var.d();
        DialogButtonDto c = c(jw40Var.b());
        kw40 c2 = jw40Var.c();
        return new MultiorderDialogDto(e, d, c, c2 != null ? c(c2) : null, jw40Var.f(), jw40Var.a());
    }
}
