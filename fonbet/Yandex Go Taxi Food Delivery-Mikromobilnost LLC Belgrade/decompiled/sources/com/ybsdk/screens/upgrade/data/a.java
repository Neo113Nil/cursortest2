package com.ybsdk.screens.upgrade.data;

import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.date.YbDateFormat;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.network.Api;
import com.ybsdk.network.dto.ApplicationStatusResponse;
import com.ybsdk.network.dto.InnResponse;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationForm;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdApplicationResponse;
import com.ybsdk.network.dto.simplifiedid.SimplifiedIdWidget;
import com.ybsdk.screens.upgrade.domain.entities.UpgradeFormEntity$SecondDocumentType;
import defpackage.db21;
import defpackage.ja21;
import defpackage.lvy0;
import defpackage.n13;
import defpackage.ny61;
import defpackage.rb21;
import defpackage.rfs0;
import defpackage.tcc;
import defpackage.ufs0;
import defpackage.vfs0;
import defpackage.vqg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a implements db21 {
    public final Api a;

    public a(Api api) {
        this.a = api;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpgradeRepositoryImpl$createApplication$1 upgradeRepositoryImpl$createApplication$1;
        int i;
        Object c;
        ja21 ja21Var;
        ArrayList arrayList;
        ufs0 ufs0Var;
        SimplifiedIdWidget.Theme.ButtonTheme buttonTheme;
        SimplifiedIdWidget.Theme.ButtonTheme buttonTheme2;
        SimplifiedIdWidget.Theme.ButtonTheme buttonTheme3;
        SimplifiedIdWidget.Theme.Background background;
        SimplifiedIdWidget.Theme.ButtonTheme buttonTheme4;
        SimplifiedIdWidget.Theme.Background background2;
        SimplifiedIdWidget.Theme.Background background3;
        SimplifiedIdWidget.Theme.Background background4;
        UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType;
        Date b;
        if (continuationImpl instanceof UpgradeRepositoryImpl$createApplication$1) {
            upgradeRepositoryImpl$createApplication$1 = (UpgradeRepositoryImpl$createApplication$1) continuationImpl;
            int i2 = upgradeRepositoryImpl$createApplication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeRepositoryImpl$createApplication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeRepositoryImpl$createApplication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeRepositoryImpl$createApplication$1.label;
                String str = null;
                if (i != 0) {
                    b.b(obj);
                    UpgradeRepositoryImpl$createApplication$2 upgradeRepositoryImpl$createApplication$2 = new UpgradeRepositoryImpl$createApplication$2(this, null);
                    upgradeRepositoryImpl$createApplication$1.label = 1;
                    c = c.c(upgradeRepositoryImpl$createApplication$2, upgradeRepositoryImpl$createApplication$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                SimplifiedIdApplicationResponse simplifiedIdApplicationResponse = (SimplifiedIdApplicationResponse) c;
                String applicationId = simplifiedIdApplicationResponse.getApplicationId();
                String agreement = simplifiedIdApplicationResponse.getAgreement();
                SimplifiedIdApplicationForm form = simplifiedIdApplicationResponse.getForm();
                if (form != null) {
                    String applicationId2 = simplifiedIdApplicationResponse.getApplicationId();
                    List<SimplifiedIdApplicationResponse.SecondDocument> secondDocuments = simplifiedIdApplicationResponse.getSecondDocuments();
                    List<SimplifiedIdApplicationResponse.SecondDocument> list = secondDocuments;
                    if (list == null || list.isEmpty()) {
                        upgradeFormEntity$SecondDocumentType = UpgradeFormEntity$SecondDocumentType.SNILS_OR_INN;
                    } else {
                        SimplifiedIdApplicationResponse.SecondDocument secondDocument = SimplifiedIdApplicationResponse.SecondDocument.INN;
                        upgradeFormEntity$SecondDocumentType = (secondDocuments.contains(secondDocument) && secondDocuments.contains(SimplifiedIdApplicationResponse.SecondDocument.SNILS)) ? UpgradeFormEntity$SecondDocumentType.SNILS_OR_INN : secondDocuments.contains(secondDocument) ? UpgradeFormEntity$SecondDocumentType.INN : UpgradeFormEntity$SecondDocumentType.SNILS;
                    }
                    UpgradeFormEntity$SecondDocumentType upgradeFormEntity$SecondDocumentType2 = upgradeFormEntity$SecondDocumentType;
                    String firstName = form.getFirstName();
                    String str2 = firstName == null ? "" : firstName;
                    String lastName = form.getLastName();
                    String str3 = lastName == null ? "" : lastName;
                    String middleName = form.getMiddleName();
                    String str4 = middleName == null ? "" : middleName;
                    String passportNumber = form.getPassportNumber();
                    String str5 = passportNumber == null ? "" : passportNumber;
                    String birthday = form.getBirthday();
                    String a = (birthday == null || (b = vqg.b(birthday, YbDateFormat.SHORT_SERVER_DATE_ONLY)) == null) ? null : vqg.a(b, YbDateFormat.SHORT_USER_DATE_ONLY);
                    String str6 = a == null ? "" : a;
                    String innOrSnils = form.getInnOrSnils();
                    ja21Var = new ja21(str2, str3, str4, str5, str6, innOrSnils == null ? "" : innOrSnils, applicationId2, upgradeFormEntity$SecondDocumentType2);
                } else {
                    ja21Var = ja21.i;
                }
                List<SimplifiedIdWidget> widgets = simplifiedIdApplicationResponse.getWidgets();
                if (widgets != null) {
                    List<SimplifiedIdWidget> list2 = widgets;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    for (SimplifiedIdWidget simplifiedIdWidget : list2) {
                        String title = simplifiedIdWidget.getTitle();
                        String description = simplifiedIdWidget.getDescription();
                        String action = simplifiedIdWidget.getAction();
                        SimplifiedIdWidget.Button button = simplifiedIdWidget.getButton();
                        String text = button != null ? button.getText() : str;
                        Themes<SimplifiedIdWidget.Theme> themes = simplifiedIdWidget.getThemes();
                        SimplifiedIdWidget.Theme light = themes.getLight();
                        String color = (light == null || (background4 = light.getBackground()) == null) ? str : background4.getColor();
                        SimplifiedIdWidget.Theme dark = themes.getDark();
                        ColorModel e = lvy0.e(color, (dark == null || (background3 = dark.getBackground()) == null) ? str : background3.getColor());
                        if (e != null) {
                            SimplifiedIdWidget.Theme light2 = themes.getLight();
                            String titleTextColor = light2 != null ? light2.getTitleTextColor() : str;
                            SimplifiedIdWidget.Theme dark2 = themes.getDark();
                            ColorModel e2 = lvy0.e(titleTextColor, dark2 != null ? dark2.getTitleTextColor() : str);
                            if (e2 != null) {
                                SimplifiedIdWidget.Theme light3 = themes.getLight();
                                String descriptionTextColor = light3 != null ? light3.getDescriptionTextColor() : str;
                                SimplifiedIdWidget.Theme dark3 = themes.getDark();
                                if (dark3 != null) {
                                    str = dark3.getDescriptionTextColor();
                                }
                                ColorModel e3 = lvy0.e(descriptionTextColor, str);
                                SimplifiedIdWidget.Theme light4 = themes.getLight();
                                String delimiterColor = light4 != null ? light4.getDelimiterColor() : null;
                                SimplifiedIdWidget.Theme dark4 = themes.getDark();
                                ColorModel e4 = lvy0.e(delimiterColor, dark4 != null ? dark4.getDelimiterColor() : null);
                                SimplifiedIdWidget.Theme light5 = themes.getLight();
                                String color2 = (light5 == null || (buttonTheme4 = light5.getButtonTheme()) == null || (background2 = buttonTheme4.getBackground()) == null) ? null : background2.getColor();
                                SimplifiedIdWidget.Theme dark5 = themes.getDark();
                                ColorModel e5 = lvy0.e(color2, (dark5 == null || (buttonTheme3 = dark5.getButtonTheme()) == null || (background = buttonTheme3.getBackground()) == null) ? null : background.getColor());
                                SimplifiedIdWidget.Theme light6 = themes.getLight();
                                String textColor = (light6 == null || (buttonTheme2 = light6.getButtonTheme()) == null) ? null : buttonTheme2.getTextColor();
                                SimplifiedIdWidget.Theme dark6 = themes.getDark();
                                ufs0Var = new ufs0(e, e2, e3, e4, e5, lvy0.e(textColor, (dark6 == null || (buttonTheme = dark6.getButtonTheme()) == null) ? null : buttonTheme.getTextColor()));
                                arrayList2.add(new vfs0(title, description, action, text, ufs0Var));
                                str = null;
                            }
                        }
                        ufs0Var = str;
                        arrayList2.add(new vfs0(title, description, action, text, ufs0Var));
                        str = null;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new rfs0(applicationId, agreement, ja21Var, arrayList);
            }
        }
        upgradeRepositoryImpl$createApplication$1 = new UpgradeRepositoryImpl$createApplication$1(this, continuationImpl);
        Object obj2 = upgradeRepositoryImpl$createApplication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeRepositoryImpl$createApplication$1.label;
        String str7 = null;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ja21 ja21Var, ContinuationImpl continuationImpl) {
        UpgradeRepositoryImpl$getInnSuggest$1 upgradeRepositoryImpl$getInnSuggest$1;
        int i;
        Object c;
        if (continuationImpl instanceof UpgradeRepositoryImpl$getInnSuggest$1) {
            upgradeRepositoryImpl$getInnSuggest$1 = (UpgradeRepositoryImpl$getInnSuggest$1) continuationImpl;
            int i2 = upgradeRepositoryImpl$getInnSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeRepositoryImpl$getInnSuggest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeRepositoryImpl$getInnSuggest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeRepositoryImpl$getInnSuggest$1.label;
                if (i != 0) {
                    b.b(obj);
                    UpgradeRepositoryImpl$getInnSuggest$2 upgradeRepositoryImpl$getInnSuggest$2 = new UpgradeRepositoryImpl$getInnSuggest$2(this, ja21Var, null);
                    upgradeRepositoryImpl$getInnSuggest$1.label = 1;
                    c = c.c(upgradeRepositoryImpl$getInnSuggest$2, upgradeRepositoryImpl$getInnSuggest$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                return c instanceof Result.Failure ? new rb21(Collections.singletonList(((InnResponse) c).getInn())) : c;
            }
        }
        upgradeRepositoryImpl$getInnSuggest$1 = new UpgradeRepositoryImpl$getInnSuggest$1(this, continuationImpl);
        Object obj2 = upgradeRepositoryImpl$getInnSuggest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeRepositoryImpl$getInnSuggest$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1 upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1;
        int i;
        Object c;
        if (continuationImpl instanceof UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1) {
            upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1 = (UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1) continuationImpl;
            int i2 = upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.label;
                if (i != 0) {
                    b.b(obj);
                    UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$2 upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$2 = new UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$2(this, str, null);
                    upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.label = 1;
                    c = c.c(upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$2, upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                return c instanceof Result.Failure ? n13.c((ApplicationStatusResponse) c) : c;
            }
        }
        upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1 = new UpgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1(this, continuationImpl);
        Object obj2 = upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeRepositoryImpl$getSimplifiedIdApplicationStatus$1.label;
        if (i != 0) {
        }
        if (c instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ja21 ja21Var, ContinuationImpl continuationImpl) {
        UpgradeRepositoryImpl$submitForm$1 upgradeRepositoryImpl$submitForm$1;
        int i;
        if (continuationImpl instanceof UpgradeRepositoryImpl$submitForm$1) {
            upgradeRepositoryImpl$submitForm$1 = (UpgradeRepositoryImpl$submitForm$1) continuationImpl;
            int i2 = upgradeRepositoryImpl$submitForm$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeRepositoryImpl$submitForm$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeRepositoryImpl$submitForm$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeRepositoryImpl$submitForm$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                UpgradeRepositoryImpl$submitForm$2 upgradeRepositoryImpl$submitForm$2 = new UpgradeRepositoryImpl$submitForm$2(this, str2, ja21Var, str, null);
                upgradeRepositoryImpl$submitForm$1.label = 1;
                Object c = c.c(upgradeRepositoryImpl$submitForm$2, upgradeRepositoryImpl$submitForm$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        upgradeRepositoryImpl$submitForm$1 = new UpgradeRepositoryImpl$submitForm$1(this, continuationImpl);
        Object obj2 = upgradeRepositoryImpl$submitForm$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeRepositoryImpl$submitForm$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ja21 ja21Var, ContinuationImpl continuationImpl) {
        UpgradeRepositoryImpl$uploadDraft$1 upgradeRepositoryImpl$uploadDraft$1;
        int i;
        if (continuationImpl instanceof UpgradeRepositoryImpl$uploadDraft$1) {
            upgradeRepositoryImpl$uploadDraft$1 = (UpgradeRepositoryImpl$uploadDraft$1) continuationImpl;
            int i2 = upgradeRepositoryImpl$uploadDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                upgradeRepositoryImpl$uploadDraft$1.label = i2 - Integer.MIN_VALUE;
                Object obj = upgradeRepositoryImpl$uploadDraft$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = upgradeRepositoryImpl$uploadDraft$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                UpgradeRepositoryImpl$uploadDraft$2 upgradeRepositoryImpl$uploadDraft$2 = new UpgradeRepositoryImpl$uploadDraft$2(this, str, ja21Var, null);
                upgradeRepositoryImpl$uploadDraft$1.label = 1;
                Object c = c.c(upgradeRepositoryImpl$uploadDraft$2, upgradeRepositoryImpl$uploadDraft$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        upgradeRepositoryImpl$uploadDraft$1 = new UpgradeRepositoryImpl$uploadDraft$1(this, continuationImpl);
        Object obj2 = upgradeRepositoryImpl$uploadDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = upgradeRepositoryImpl$uploadDraft$1.label;
        if (i == 0) {
        }
    }
}
